# TDD

> “Good unit test and acceptance test coverage are the hallmarks of an XP  project.
An XP project takes the attitude that developers are responsible for proving to their customers that the code works correctly, not customers proving the code is
broken.”

## The Agile Test - 4 Quadrants

![Agile Testing Matrix](https://www.scaledagileframework.com/wp-content/uploads/2018/09/Agile-Testing_F01_web.png)

## Tests Pyramid
![Inverting the Test Pyramid](http://www.adapttransformation.com/wp-content/uploads/flip.jpg)

## How the developers code? How they think when they are coding?
  - Zig Zag
  - Refactor?
    - Who will touch the code? If it is not you, will someone else touch the code?
  - Unit Test to help Refactor

## Unit Tests
  - UNIT TESTING is a level of software testing where individual units of a software are tested.
  - Unit tests are Developer's tests. It is the Developer testing what they are coding.
  - What is the problem if the Developer doesn't test their code?
    - How many processor we have here running code?
    - What you can do in your life without a code running?
    - Boeing 737
    - Volkswagen problem
    - Insulin app
    - Company Balance sheet

### Unit Tests Benefits
  - Ensure your code is working
  - Maintain the code is easier
  - Refactor
  - A testable code is Decoupled by default

### Test Coverage
  - What is test coverage?
  - The market says 80%
  - What to test:
    - Public methods
  - Sonar / Build / PR
  - Strategy to add Unit Test
    - Start with 10% then ensure that this % will not drop
      - This way I ensure that new code will have test

### But what the problem of writing tests after and not before the Dev?
  - But I'm writing testable code?
    - If not, most probably I'll not write tests
    - If I'm not writing tests, most probably my test suite will not be trusty

## TDD

### TDD Benefits
  - TDD is a developer tool
  - Helps the Dev to think before code
  - Helps the Dev to question about Business Logic before coding
    - Finger thinking
  - YAGNI
  - Tests as Documentation - A Developer Documentation - Code

### TDD Process

![TDD Process](https://www.scaledagileframework.com/wp-content/uploads/2018/09/Test-Driven-Development_F01_web-768x684.png)

### Uncle Bob 3 Rules
  http://butunclebob.com/ArticleS.UncleBob.TheThreeRulesOfTdd

  - You are not allowed to write any production code unless it is to make a failing unit test pass.

  - You are not allowed to write any more of a unit test than is sufficient to fail; and compilation failures are failures.

  - You are not allowed to write any more production code than is sufficient to pass the one failing unit test.

### TDD example
  - Business Logic
    - If value bigger than 7 then status = APPROVED
    - If value lower than 7 then status = NOT APPROVED

    Unit Tests

    ```
    TestApproved() {
      value = 9
      return = checkStatus(value)
      assert(return == APPROVED)
    }
    ```

    ```
      checkStatus(value) {
        if value > 7 then return Approved
      }
    ```

    ```
    TestNotApproved() {
      value = 3
      return = checkStatus(value)
      assert(return == NOT APPROVED)
    }
    ```

    ```
    checkStatus(value) {
      if value > 7 then return Approved
      else NOT APPROVED
    }
    ```
    > Problem: Its not matching exactly the Business Rules, so lets change

    ```
    TestApproved() {
      value = 7
      return = checkStatus(value)
      assert(return == APPROVED)
    }
    ```

    > It will throw NOT APPROVED due my if - value > 7
    > So then I need to check with PO the exactly Business Logic
    > What happens if the value is equal 7
    > So the PO changes the Business Logic to

    - If value equals or bigger than 7 then status = APPROVED
    - If value lower than 7 then status = NOT APPROVED

    ```
    checkStatus(value) {
      if value >= 7 then return Approved
      else NOT APPROVED
    }
    ```

    > But even that now it is working the tests are not saying exactly what the Business Rules says. So will confirm with the PO the High and Low limits and the PO Say that the rules are:

    - If value between 7 and 10 then status = APPROVED
    - If value between 0 and 6  then status = NOT APPROVED

    ```
    TestApproved_LowLimit() {
      value = 7
      return = checkStatus(value)
      assert(return == APPROVED)
    }
    ```

    > OK, but what is the high limit, is there any one? Need to check with PO

    ```
    TestApproved_HighLimit() {
      value = 10
      return = checkStatus(value)
      assert(return == APPROVED)
    }
    ```

    > Ok, my code is working, so I don't need to change it.
    > SO now I will write tests for the NOT APPROVED limits

    ```
    TestNotApproved_HighLimit() {
      value = 6
      return = checkStatus(value)
      assert(return == NOT APPROVED)
    }
    ```

    ```
    TestNotApproved_LowLimit() {
      value = 0
      return = checkStatus(value)
      assert(return == NOT APPROVED)
    }
    ```

    > Ok. But now what happens to my code if I receive value out of limits (Bigger than 10 and lower than 0).?

    ```
    checkStatus(value) {
      if value >= 7 then return Approved
      else NOT APPROVED
    }
    ```

    > So I need check with the PO. and PO Says it should return ERROR (a new Business Logic).

    - If value between 7 and 10 then status = APPROVED
    - If value between 0 and 6  then status = NOT APPROVED
    - If value bigger than 10 then status = ERROR
    - If value lower than 0 then status = ERROR

    > And I can create a test to check if I receive an invalid value, now I know that value is between 0 and 10. First checking above limit

    ```
    TestAbove_Limit() {
      value = 11
      return = checkStatus(value)
      assert(return == ERROR)
    }
    ```

    ```
    checkStatus(value) {
      if value < 10 then
        if value >= 7 then return Approved
        else NOT APPROVED
      else
        return ERROR
    }
    ```

    > Checking below than the limit 0

    ```
    TestBelow_Limit() {
      value = -1
      return = checkStatus(value)
      assert(return == ERROR)
    }
    ```

    ```
    checkStatus(value) {
      if value > 0 and value < 10  then
        if value >= 7 then return APPROVED
        else NOT APPROVED
      else
        return ERROR
    }
    ```


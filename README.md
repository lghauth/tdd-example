# TDD and BDD

## Why Developers should test?
  - What is the problem if the Developer doesn't test their code?
    - How many processor we have here running code?
    - What you can do in your life without a code running?
    - Boeing 737
    - Volkswagen problem
    - Insulin app
    - Company Balance sheet

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
  - Multimeter example
  - UNIT TESTING is a level of software testing where individual units of a software are tested.
  - Unit tests are Developer's tests. It is the Developer testing what they are coding.

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
  - In a project with a short deadline, tests will be left to be done after and after means never
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

### TDD Example:

[FirstStep](https://github.com/lghauth/tdd-example/blob/FirstStep/README.md)
[SecondStep](https://github.com/lghauth/tdd-example/blob/SecondStep/README.md)
[ThirdStep](https://github.com/lghauth/tdd-example/blob/ThirdStep/README.md)
[FourthStep](https://github.com/lghauth/tdd-example/blob/FourthStep/README.md)
[FifthStep](https://github.com/lghauth/tdd-example/blob/FifthStep/README.md)

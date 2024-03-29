# TDD

## The goal of testing...

> "to increase confidence for stakeholders through evidence" Dan North

Stakeholders:
- people
- If I'm building a software, who are my stakeholders:
    - Users
    - Developers
    - Future you
        - 6 months ago I'm a rubbish programmer
    - PO
    - Security, Support, Analysts, Managers,...
    - People who lives, that your work touch
    
Increase Confidence:
    - it is not my confidence, it is their confidence
    - increase by how much?
        - If I'm security, what gives me confidence?
        - If I'm user, what gives me confidence?
        - If I'm developer, what give me confidence?
        
- How I achieve confidence?
    - By saying "Trust me"? No, through evidence
    - How will you demonstrate it?
    
- A good tester has 3 super powers, the most important:
    - Get inside someone else's head:
        - You cannot think about what would make someone confidence, unless you think as them:
            - Empathy
    
> Tests is about other people, about confidence, about evidence
        
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
![Testing Pyramid](https://martinfowler.com/articles/practical-test-pyramid/testPyramid.png)
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

## How deep are your unit tests?

> "I get paid for code that works, not for tests, so my philosophy is to test as little as 
> possible to reach a given level of confidence." Kent Beck

### But what the problem of writing tests after and not before the Dev?
  - In a project with a short deadline, tests will be left to be done after and after means never
  - But I'm writing testable code?
    - If not, most probably I'll not write tests
    - If I'm not writing tests, most probably my test suite will not be trusty

## TDD

### TDD History

It is a very old technique.

Early 1960s IBM run a project for NASA using a technique equivalent to TDD:

> "Project Mercury ran with very short (half-day) iterations that were time boxed. 
> The development team conducted a technical review of all changes, and, interestingly, 
> applied the Extreme Programming practice of test-first development, planning and writing tests 
> before each micro-increment."

Before that, the oldest reference to the root of TDD:

> "The first attack on the checkout problem may be made before coding is begun. In order to fully ascertain the 
> accuracy of the answers, it is necessary to have a hand-calculated  check case with which to compare the answers which
> will later be calculated by the machine"

> Digital Computer Programming D.D. McCracken, 1957

### TDD 5 Principles

F.I.R.S.T
- Fast
- Isolated
- Repeatable
- Self-Verifying
- Timely

### TDD Benefits
  - TDD is a developer tool
  - Helps the Dev to think before code
  - Helps the Dev to question about Business Logic before coding
    - Finger thinking
  - YAGNI - You ain't gonna need it. 
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


# BDD

BDD has been created by Dan North and Chris Matts.

Dan North said in his article [Introducing BDD](https://dannorth.net/introducing-bdd/):
    
> That's not to say that testing isn't intrinsic to TDD - the resulting set of methods is an effective way of ensuring
> your code works. However, if the methods do not comprehensively describe the behaviour of your system, then they are
> lulling you into a false sense of security.
>
> I started using the word "behaviour" in place of "test" in my dealings with TDD and found that not only did it seem to
> fit but also that a whole category of coaching questions magically dissolved.
> 
> I now had answers to some of those TDD questions
>   - What to call your test is easy – it’s a sentence describing the next behaviour in which you are interested.
>   - How much to test becomes moot - you can only describe so much behaviour in a single sentence.
>   - When a test fails, simple work through the process described above
>       - either you introduced a bug;
>       - the behaviour moved
>       - or the test is no longer relevant.
>
> I found the shift from thinking in tests to thinking in behaviour so profound that I started to refer TDD as BDD, or
> behaviour-driven development.

### Requirements are behaviour

> If we could develop a consistent vocabulary for analysts, testers, developers and the business, then we would be well
> on the way to eliminating some of ambiguity and miscommunication that occur when technical people tak to business people.

![Same Vocabulary](https://www.scaledagileframework.com/wp-content/uploads/2018/09/Behavior-Driven-Development_F01_HI-RES.png)

> Together, this group reaches alignment on exactly what to build to reduce the rework associated with building the wrong thing and to accelerate the flow of value.
  
 https://www.scaledagileframework.com/behavior-driven-development/
 
### BDD provides a “ubiquitous language” for analysis
 
> A story’s behaviour is simply its acceptance criteria – if the system fulfils all the acceptance criteria, 
> it’s behaving correctly; if it does not, it isn’t. So we created a template to capture a story’s acceptance criteria.
> 
>      - Given some initial context (the givens)
>      - When an event occurs,
>      - then ensure some outcomes.

### The Behavior-Driven Development Process by a team (not only the Dev)

![BDD 3 Phases](https://www.devprojournal.com/wp-content/uploads/2019/08/bdd-process.png)

- Discovery: PO creates acceptance criteria as part of writing a story or feature. The discovery process is collaborative,
and team members also discover and contribute additional criteria. (Refinement on Scrum);

- Formulation: Solidifies Acceptance Criteria by creating Acceptance tests. Acceptance tests serve to record the decisions
 made in the conversation between the team and the Product Owner so that the team understands the specific intended behavior.
                                                                            
- Automation: Automates the acceptance tests, so they can be run continuously;

### BDD Example

Given a story:

As a teacher, 
I want the system to determine if the approval status based on the grade
so that I can decide if it is approved or not approved

> - given a grade equals or greater than 7
> - and equals or lower than 10
> - when the system verify the status
> - then it should return APPROVED


> - given a grade lower than 7
> - and equals or greater than 0
> - when the system verify the status
> - then it should return NOT APPROVED


> - given a grade lower than 0
> - and greater than 10
> - when the system verify the status
> - then it should return ERROR


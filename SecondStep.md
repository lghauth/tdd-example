### TDD example
#### Second Step

Note: If you did not check the FirstStep Branch. Please check and follow the steps in FirstStep.md

In the First Step we created 2 tests and also created a production code to attend the below Business Logic:

> - If grade greater than 7 then status is APPROVED
> - If grade less than 7 then status is NOT APPROVED

The tests:

```java

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void checkStatusApproved() {
        //Given
        int grade = 9;
        //When
        String status = Main.checkStatus(grade);
        //Then
        Assert.assertEquals("Approved".toUpperCase(), status);
    }

    @Test
    void checkStatusNotApproved() {
        //Given
        int grade = 3;
        //When
        String status = Main.checkStatus(grade);
        //Then
        Assert.assertEquals("Not Approved".toUpperCase(), status);
    }
}

```

The problem with the tests above are that they are not reflecting the business logic. If someone else that have never
read the business logic and only read your tests, they will think that the business logic is:

> - If grade equals 9 then status is APPROVED
> - If grade equals 3 then status is NOT APPROVED

Which even if the tests are passing, it is not reflecting the real business logic.
So we need to change the tests so they reflect the read business logic. Let's start with the checkStatusApproved.

My Business logic for the status approved is:

> - If grade greater than 7 then status is APPROVED

So I need a test which reflect this Business Logic. So I will start changing my test name:

```java
class MainTest {
    @Test
    void given_a_grade_less_than_seven_then_status_should_be_approved() {
        //Given
        int grade = 9;
        //When
        String status = Main.checkStatus(grade);
        //Then
        Assert.assertEquals("Approved".toUpperCase(), status);
    }

    @Test
    void checkStatusNotApproved() {
        //Given
        int grade = 3;
        //When
        String status = Main.checkStatus(grade);
        //Then
        Assert.assertEquals("Not Approved".toUpperCase(), status);
    }
}
```

Now I'm going to change the name for the Not Approved Test, to match the business Logic:

> - If grade less than 7 then status is NOT APPROVED

```java
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void given_a_grade_greater_than_seven_then_status_should_be_approved() {
        //Given
        int grade = 9;
        //When
        String status = Main.checkStatus(grade);
        //Then
        Assert.assertEquals("Approved".toUpperCase(), status);
    }

    @Test
    void given_a_grade_less_than_seven_then_status_should_be_not_approved() {
        //Given
        int grade = 3;
        //When
        String status = Main.checkStatus(grade);
        //Then
        Assert.assertEquals("Not Approved".toUpperCase(), status);
    }
}
```
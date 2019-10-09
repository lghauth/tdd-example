### TDD example
#### Third Step

Note: If you did not check the FirstStep and SecondStep Branchs. Please check and follow the steps:

[FirstStep](https://github.com/lghauth/tdd-example/blob/FirstStep/README.md)
[SecondStep](https://github.com/lghauth/tdd-example/blob/SecondStep/README.md)

In the Second Step we fixed the tests to reflect exactly the business logic:

> - If grade greater than 7 then status is APPROVED
> - If grade less than 7 then status is NOT APPROVED


Now that the name of my tests are matching the Business Logic. Even our tests now are matching the business logic, one 
question is raised. What happens when the grade is 7? So at this point we found that our tests are not covering when the
grade is equal 7. So we need back to PO (or BA) and ask, what happens when the grade is exactly 7 (not greater and not 
less than 7).

After checking with the PO, he explain to us that when the grade is 7 the status should be APPROVED. So now our Business
Logic is:

> - If grade equals or greater than 7 then status is APPROVED
> - If grade less than 7 then status is NOT APPROVED

Such question, make us to think about if there is any limit for the grade. What is the domain for grade. So we ask the
PO. And he explains that the grade can be between 0 and 10. And from 0 to 6 the status should be not approved and from 7
to 10 the status should be approved.

Well, now our Business Logic is:

> - If grade equals or greater than 7 then status is APPROVED
> - If grade equals or less than 10 then status is APPROVED

> - If grade equals or greater than 0 then status is NOT APPROVED
> - If grade equals or less than 6 then status is NOT APPROVED

Ok, so lets change your tests to reflect the new Business Logic.

```java
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void given_a_grade_equals_or_greater_than_seven_then_status_should_be_approved() {
        //Given
        int grade = 7;
        //When
        String status = Main.checkStatus(grade);
        //Then
        Assert.assertEquals("Approved".toUpperCase(), status);
    }

    @Test
    void given_a_grade_equals_or_less_than_ten_then_status_should_be_approved() {
        //Given
        int grade = 10;
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

Now we have 2 tests that exactly reflects the grade domain for APPROVED. And now we have one test failing:

> given_a_grade_equals_or_greater_than_seven_then_status_should_be_approved

> Expected :APPROVED
> Actual   :NOT APPROVED

So now that we have a failed test, we can fix our code.

```java
public class Main {
    static String checkStatus(int grade) {
        if (grade >= 7 && grade <= 10) {
            return "Approved".toUpperCase();
        } else {
            return "Not Approved".toUpperCase();
        }
    }
}
```

Now we are going to create the tests for Not Approved.

> - If grade equals or greater than 0 then status is NOT APPROVED
> - If grade equals or less than 6 then status is NOT APPROVED

```java
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void given_a_grade_equals_or_greater_than_seven_then_status_should_be_approved() {
        //Given
        int grade = 7;
        //When
        String status = Main.checkStatus(grade);
        //Then
        Assert.assertEquals("Approved".toUpperCase(), status);
    }

    @Test
    void given_a_grade_equals_or_less_than_ten_then_status_should_be_approved() {
        //Given
        int grade = 10;
        //When
        String status = Main.checkStatus(grade);
        //Then
        Assert.assertEquals("Approved".toUpperCase(), status);
    }

    @Test
    void given_a_grade_equals_or_greater_than_zero_then_status_should_be_not_approved() {
        //Given
        int grade = 0;
        //When
        String status = Main.checkStatus(grade);
        //Then
        Assert.assertEquals("Not Approved".toUpperCase(), status);
    }

    @Test
    void given_a_grade_equals_or_less_than_six_then_status_should_be_not_approved() {
        //Given
        int grade = 6;
        //When
        String status = Main.checkStatus(grade);
        //Then
        Assert.assertEquals("Not Approved".toUpperCase(), status);
    }
}
```

Now we have 2 tests that exactly reflects the grade domain for NOT APPROVED. And this case we do not have any test failing.
Which means our code is handling both APPROVED and NOT APPROVED correctly.

But we can do some refactor, to make our code also tell us what is the exactly Business Logic. So lets do it, refactor our code.
And we can do that without any fear as we have tests to ensure we will not break our Business Logic.

```java
public class Main {
    static String checkStatus(int grade) {
        String status = "";

        if (grade >= 7 && grade <= 10) {
            status = "Approved".toUpperCase();
        }

        if (grade >= 0 && grade <= 6) {
            status = "Not Approved".toUpperCase();
        }

        return status;
    }
}
```

[FourthStep](https://github.com/lghauth/tdd-example/blob/FourthStep/README.md)
[FifthStep](https://github.com/lghauth/tdd-example/blob/FifthStep/README.md)

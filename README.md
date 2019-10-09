### TDD example
#### Fourth Step

Note: If you did not check the FirstStep, SecondStep and ThirdStep Branches. 
Please check and follow the steps:

[FirstStep](https://github.com/lghauth/tdd-example/blob/FirstStep/README.md)
[SecondStep](https://github.com/lghauth/tdd-example/blob/SecondStep/README.md)
[ThirdStep](https://github.com/lghauth/tdd-example/blob/ThirdStep/README.md)

In the Third Step we found that the correct Business Logic is:

> - If grade equals or greater than 7 then status is APPROVED
> - If grade equals or less than 10 then status is APPROVED

> - If grade equals or greater than 0 then status is NOT APPROVED
> - If grade equals or less than 6 then status is NOT APPROVED

And we changed our tests and our code to reflect this new Business Logic.

By looking our tests/code/Business Logic another question comes to our mind. 
What happens when the grade is out of the domain for APPROVED and NOT APPROVED?
What happens if the grade is less than 0 or greater than 10.

So we need to ask to PO again. Asking him the questions above, his answer is if the grade is
less than 0 the status should be error and if the grade is greater than 10 also should be error.

So now we have our Business Logic:

> - If grade equals or greater than 7 then status is APPROVED
> - If grade equals or less than 10 then status is APPROVED

> - If grade equals or greater than 0 then status is NOT APPROVED
> - If grade equals or less than 6 then status is NOT APPROVED

> - If grade less than 0 then status is ERROR
> - If grade greater than 10 then status is ERROR

Let's write a test for it!!

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

    @Test
    void given_a_grade_less_than_zero_then_status_should_be_error(){
        //Given
        int grade = -1;
        //When
        String status = Main.checkStatus(grade);
        //Then
        Assert.assertEquals("Error".toUpperCase(), status);
    }
}
```

Now that we have a failed test, we can go and change our code.

> Expected :ERROR
> Actual   :

```java
public class Main {
    static String checkStatus(int grade) {
        String status = "";

        if (grade >= 0) {
            if (grade >= 7 && grade <= 10) {
                status = "Approved".toUpperCase();
            }

            if (grade >= 0 && grade <= 6) {
                status = "Not Approved".toUpperCase();
            }
        } else {
            status = "Error".toUpperCase();
        }

        return status;
    }
}
```

Lets write the other test:

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

    @Test
    void given_a_grade_less_than_zero_then_status_should_be_error(){
        //Given
        int grade = -1;
        //When
        String status = Main.checkStatus(grade);
        //Then
        Assert.assertEquals("Error".toUpperCase(), status);
    }

    @Test
    void given_a_grade_greater_than_ten_then_status_should_be_error(){
        //Given
        int grade = 11;
        //When
        String status = Main.checkStatus(grade);
        //Then
        Assert.assertEquals("Error".toUpperCase(), status);
    }
}
```

Now that we have a failed test, we can go and change our code.

> Expected :ERROR
>  Actual

```java
public class Main {
    static String checkStatus(int grade) {
        String status = "";

        if (grade >= 0 && grade <= 10) {
            if (grade >= 7 && grade <= 10) {
                status = "Approved".toUpperCase();
            }

            if (grade >= 0 && grade <= 6) {
                status = "Not Approved".toUpperCase();
            }
        } else {
            status = "Error".toUpperCase();
        }

        return status;
    }
}
```

Ok, my code is working now. Of course there are some refactor to be done, to make this code
better (we are checking grade >=0 and grade <= 10 two time).

In the FifthStep we are going to work in some refactor.  

[FifthStep](https://github.com/lghauth/tdd-example/blob/FifthStep/README.md)

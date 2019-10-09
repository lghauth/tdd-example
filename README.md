### TDD example
#### First Step
In this first step, we received the below Business Logic:
 
- Business Logic
    - If grade greater than 7 then status is APPROVED
    - If grade less than 7 then status is NOT APPROVED

##### Unit Tests
We will start by creating 2 simple tests. Note that they are not 100% correct yet and also the Business Logic has a failure.
That's what we want in this first step and we will build the knowledge incrementally as the tests will also evolve incrementally.

First we will create a test which will test when a grade is greater than 7, the status should return Approved:
```java
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void checkStatusApproved(){
        //Given
        int grade = 9;
        //When
        String status = Main.checkStatus(grade);
        //Then
        Assert.assertEquals("Approved".toUpperCase(), status);
    }
}
```

The test above will fail as the checkStatus method in Main Class does not exist.
Now that we have a fail test, we will create the production code. Method checkStatus in Main Class: 
```java
public class Main {
    static String checkStatus(int grade) {
        if (grade > 7) {
            return "Approved".toUpperCase();
        }
        return null;
    }
}
```

Now we are going to create the second test, to test when the grade is less than 7:

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
    void checkStatusNotApproved(){
        //Given
        int grade = 3;
        //When
        String status = Main.checkStatus(grade);
        //Then
        Assert.assertEquals("Not Approved".toUpperCase(), status);
    }
}
```

The test above will fail as the checkStatus method is not handling grade less than 7:

```
java.lang.AssertionError: expected:<NOT APPROVED> but was:<null>
Expected :NOT APPROVED
Actual   :null
```

As we have a failed test, we can go and add some production code to make this test pass (gree):

```java
public class Main {
    static String checkStatus(int grade) {
        if (grade > 7) {
            return "Approved".toUpperCase();
        } else {
            return "Not Approved".toUpperCase();
        }
    }
}
```

The First Step is done. 
Our production code is attending the Business Logic and our code is 100% covered by Tests (Code Coverage).

 > Main	100% (1/1)	100% (1/1)	100% (3/3)

[SecondStep](https://github.com/lghauth/tdd-example/blob/SecondStep/README.md)
[ThirdStep](https://github.com/lghauth/tdd-example/blob/ThirdStep/README.md)
[FourthStep](https://github.com/lghauth/tdd-example/blob/FourthStep/README.md)
[FifthStep](https://github.com/lghauth/tdd-example/blob/FifthStep/README.md)
 
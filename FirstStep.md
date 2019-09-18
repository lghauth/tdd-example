### TDD example
#### First Step
In this first step, we received the below Business Logic:
 
- Business Logic
    - If grade bigger than 7 then status is APPROVED
    - If grade lower than 7 then status is NOT APPROVED

##### Unit Tests
We will start by creating 2 simple tests. Note that they are not 100% correct yet. 
We will build the knowledge incrementally as the tests will also evolve incrementally.

First we will create a test which will test when a grade is bigger than 7, the status should return Approved:
```java
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void given_a_grade_bigger_than_seven_then_status_approved(){
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
        if (grade > 0) {
            return "Approved".toUpperCase();
        }
        return null;
    }
}
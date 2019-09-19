### TDD example
#### Fourth Step

Note: If you did not check the FirstStep, SecondStep, ThirdStep and FourthStep Branches. 
Please check and follow the steps in FirstStep.md, SecondStep.md, ThirdStep.md and FourthStep.md.

In the Fourth Step we found that the correct Business Logic is:

> - If grade equals or greater than 7 then status is APPROVED
> - If grade equals or less than 10 then status is APPROVED

> - If grade equals or greater than 0 then status is NOT APPROVED
> - If grade equals or less than 6 then status is NOT APPROVED

> - If grade less than 0 then status is ERROR
> - If grade greater than 10 then status is ERROR

And we changed our tests and our code to reflect this new Business Logic.

As mentioned in the FourthStep,  to make this code better (we are checking grade >=0
and grade <= 10 two time) we need some refactor. 

Lets do some refactor in our Main.java code.

First, lets remove the redundant if statements.

```java
public class Main {
    static String checkStatus(int grade) {
        if (grade >= 7 && grade <= 10) {
            return "Approved".toUpperCase();
        }

        if (grade >= 0 && grade <= 6) {
            return "Not Approved".toUpperCase();
        }

        return "Error".toUpperCase();
    }
}
```

And lets run the tests to see if everything is still working as we expect.

> Tests passed: 6 of 6 tests - 54ms

Great, we can do some more refactor to make our code better:

```java
public class Main {
    static String checkStatus(int grade) {
        if (isApproved(grade))
            return "Approved".toUpperCase();

        if (isNotApproved(grade))
            return "Not Approved".toUpperCase();

        return "Error".toUpperCase();
    }

    private static boolean isNotApproved(int grade) {
        return grade >= 0 && grade <= 6;
    }

    private static boolean isApproved(int grade) {
        return grade >= 7 && grade <= 10;
    }
}
```

And lets run the tests to see if everything is still working as we expect.

> Tests passed: 6 of 6 tests - 54ms

Ok, so if you did not notice, our code does not have a Main method. And since the FirstStep until now
we did not run our code. Only ran our tests. Now it's time to run our code, to see if it works.

Let's create a Main function to simulate it:

```java
public class Main {
    public static void main(String args[]) {
        System.out.println(checkStatus(7).toUpperCase());
        System.out.println(checkStatus(10).toUpperCase());

        System.out.println(checkStatus(0).toUpperCase());
        System.out.println(checkStatus(6).toUpperCase());

        System.out.println(checkStatus(-1).toUpperCase());
        System.out.println(checkStatus(11).toUpperCase());
    }
    
    static String checkStatus(int grade) {
        if (isApproved(grade))
            return "Approved".toUpperCase();

        if (isNotApproved(grade))
            return "Not Approved".toUpperCase();

        return "Error".toUpperCase();
    }

    private static boolean isNotApproved(int grade) {
        return grade >= 0 && grade <= 6;
    }

    private static boolean isApproved(int grade) {
        return grade >= 7 && grade <= 10;
    }
}
```

Ran our tests to ensure nothing changed:

> Tests passed: 6 of 6 tests - 85ms

And now, lets run our code, for the first time!

And it works!

Here is the output:

APPROVED
APPROVED
NOT APPROVED
NOT APPROVED
ERROR
ERROR

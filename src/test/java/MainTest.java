import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void given_the_grade_low_limit_for_status_approved_then_status_approved() {
        int grade = 7;
        String result = Main.checkStatus(grade);
        Assert.assertEquals("Approved".toUpperCase(), result);
    }

    @Test
    void given_the_grade_high_limit_for_status_approved_then_status_approved() {
        int grade = 10;
        String result = Main.checkStatus(grade);
        Assert.assertEquals("Approved".toUpperCase(), result);
    }

    @Test
    void given_the_grade_low_limit_for_status_not_approved_then_status_not_approved() {
        int grade = 0;
        String result = Main.checkStatus(grade);
        Assert.assertEquals("Not Approved".toUpperCase(), result);
    }

    @Test
    void given_the_grade_high_limit_for_status_not_approved_then_status_not_approved() {
        int grade = 6;
        String result = Main.checkStatus(grade);
        Assert.assertEquals("Not Approved".toUpperCase(), result);
    }

    @Test
    void given_grade_bigger_than_10_then_status_error() {
        int grade = 11;
        String result = Main.checkStatus(grade);
        Assert.assertEquals("Error".toUpperCase(), result);
    }

    @Test
    void given_grade_lower_than_0_then_status_error() {
        int grade = -1;
        String result = Main.checkStatus(grade);
        Assert.assertEquals("Error".toUpperCase(), result);
    }
}

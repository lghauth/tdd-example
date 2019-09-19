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

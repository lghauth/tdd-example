import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void given_a_grade_bigger_than_seven_then_status_approved() {
        //Given
        int grade = 9;
        //When
        String status = Main.checkStatus(grade);
        //Then
        Assert.assertEquals("Approved".toUpperCase(), status);
    }

    @Test
    void given_a_grade_lower_than_seven_then_status_not_approved() {
        //Given
        int grade = 3;
        //When
        String status = Main.checkStatus(grade);
        //Then
        Assert.assertEquals("Not Approved".toUpperCase(), status);
    }
}

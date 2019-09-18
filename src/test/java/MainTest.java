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

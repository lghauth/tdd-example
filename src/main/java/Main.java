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

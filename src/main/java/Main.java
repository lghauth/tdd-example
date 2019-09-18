public class Main {
    static String checkStatus(int grade) {
        if (grade > 7) {
            return "Approved".toUpperCase();
        } else {
            return "Not Approved".toUpperCase();
        }
    }
}

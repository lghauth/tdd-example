public class Main {
    static String checkStatus(int grade) {
        if (grade > 0) {
            return "Approved".toUpperCase();
        }
        return null;
    }
}

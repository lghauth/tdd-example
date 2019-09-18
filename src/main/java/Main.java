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

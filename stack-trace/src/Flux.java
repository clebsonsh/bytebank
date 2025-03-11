public class Flux {
    public static void main(String[] args) {
        System.out.println("Main started");
        try {
            method1();
        } catch (ArithmeticException | NullPointerException e) {
            String msg = e.getMessage();
            System.out.println("Exception message: " + msg);
            e.printStackTrace();
        }
        System.out.println("end of main");
    }

    private static void method1() {
        System.out.println("Method1 started");
        method2();
        System.out.println("end of method1");
    }

    private static void method2() {
        System.out.println("Method2 started");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            Account account = null;
            account.deposit(i);
        }
        System.out.println("end of method2");
    }
}

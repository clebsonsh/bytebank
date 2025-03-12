public class Flux {
    public static void main(String[] args) {
        System.out.println("Main started");
        try {
            method1();
        } catch (ArithmeticException | NullPointerException | MyException e) {
            String msg = e.getMessage();
            System.out.println("Exception message: " + msg);
            e.printStackTrace();
        }
        System.out.println("end of main");
    }

    private static void method1() throws MyException {
        System.out.println("Method1 started");
        method2();
        System.out.println("end of method1");
    }

    private static void method2() throws MyException {
        System.out.println("Method2 started");

        throw new MyException("Boom!");

        // System.out.println("end of method2");
    }
}

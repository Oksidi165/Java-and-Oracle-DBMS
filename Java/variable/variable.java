public class variable {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("До: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("После: a = " + a + ", b = " + b);
    }
}
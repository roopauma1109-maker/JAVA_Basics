package Operators;

public class Logical {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println(a > 5 && b < 10);
        System.out.println(a > 20 || b < 10);
        System.out.println(!(a > b));
    }
}

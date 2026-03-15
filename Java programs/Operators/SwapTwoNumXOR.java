package Operators;

public class SwapTwoNumXOR {
    public static void main(String[] args) {

        int a = 5;
        int b = 7;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

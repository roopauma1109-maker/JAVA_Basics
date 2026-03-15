package Operators;

public class SetBit {
    public static void main(String[] args) {

        int num = 5;
        int pos = 2;

        int result = num | (1 << pos);

        System.out.println("Result = " + result);
    }
}

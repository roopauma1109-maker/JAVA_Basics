package Operators;

public class ClearBit {
     public static void main(String[] args) {

        int num = 7;
        int pos = 1;

        int result = num & ~(1 << pos);

        System.out.println("Result = " + result);
    }
}

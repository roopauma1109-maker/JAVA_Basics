package Operators;

public class Togglebit {
    public static void main(String[] args) {

        int num = 5;
        int pos = 1;

        int result = num ^ (1 << pos);

        System.out.println("Result = " + result);
    } 
}

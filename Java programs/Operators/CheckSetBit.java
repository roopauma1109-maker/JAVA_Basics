package Operators;

public class CheckSetBit {
    public static void main(String[] args) {

        int num = 5;
        int pos = 2;

        if((num & (1 << pos)) != 0){
            System.out.println("Bit is Set");
        } else {
            System.out.println("Bit is Not Set");
        }
    }
}

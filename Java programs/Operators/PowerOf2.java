package Operators;

public class PowerOf2 {
    public static void main(String[] args) {

        int num = 8;

        if((num & (num - 1)) == 0){
            System.out.println("Power of 2");
        } else {
            System.out.println("Not Power of 2");
        }
    }
}

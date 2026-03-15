package Operators;

public class EvenOrOdd {
    public static void main(String[] args) {

        int num = 8;

        if((num & 1) == 0){
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    
}

package Operators;

public class CountSetBitNum {
    public static void main(String[] args) {

        int num = 7;
        int count = 0;

        while(num > 0){
            if((num & 1) == 1){
                count++;
            }
            num = num >> 1;
        }

        System.out.println("Set bits = " + count);
    }
}
}

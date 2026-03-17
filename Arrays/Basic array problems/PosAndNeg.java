package Basic array problems;

public class PosAndNeg {
    public static void main(String[] args) {
        int arr[] = {3,-2,5,-7,8,-1};
        int pos = 0, neg = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 0)
                pos++;
            else
                neg++;
        }
        System.out.println("Positive = " + pos);
        System.out.println("Negative = " + neg);
    }
}

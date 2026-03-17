package Basic array problems;

public class RepeatNegNum {
    public static void main(String[] args) {
        int arr[] = {4,-2,7,-5,3};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0)
                arr[i] = 0;
        }
        for(int i : arr)
            System.out.print(i + " ");
    }
}

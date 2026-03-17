package Basic array problems;

public class ReplaceEvenwith-1 {
    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 7, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = -1;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

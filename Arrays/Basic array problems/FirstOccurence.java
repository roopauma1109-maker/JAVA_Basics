package Basic array problems;

public class FirstOccurence {
    public static void main(String[] args) {
        int arr[] = {5, 7, 9, 7, 3};
        int key = 7;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        System.out.println("First occurrence index = " + index);
    } 
}

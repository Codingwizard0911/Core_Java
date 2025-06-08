

public class Secondlargest {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 3, 5, 6, 8, 8 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println(arr[1]);

       
    }
    
}

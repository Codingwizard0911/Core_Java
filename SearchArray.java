
public class SearchArray {
    public static void main(String[] args) {
        int[] numbers = { 1, 9, 2, 5, 6, 7, 90 };
        int target = 9;
        for (int i=0; i< numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Found " + target + " at index " + i);
                break;
            }
            else {
                System.out.println("Not found " + target + " at index " + i);''
            }
        }
    }
    
}

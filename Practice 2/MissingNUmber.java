
import java.util.Arrays;

public class MissingNUmber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        int n = Arrays.stream(arr).max().getAsInt();
        int sum = 0;
        int tot = n * ((n + 1) / 2);
        for(int i : arr)
            sum += i;
        System.out.println(tot -sum);
    }
}

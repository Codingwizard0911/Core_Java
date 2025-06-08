import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++)
            arr[i-1] = sc.nextInt();
        for (int i = 0; i <n; i++)
        {
            for (int j = i+1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr)
            System.out.print(i+" ");
        System.out.println(arr[n-2]);


        Integer largest = null;
        Integer slargest = null;
        for (int i : arr)
        {
            if(largest == null || i > largest)
            {
                slargest = largest;
                largest = i;
            }
            else if (i != largest && (i > slargest || slargest == null) )
            {
                slargest = i;
            }
        }
        if(slargest == null)
        {
            System.out.println("NULL");
        }
        else{
            System.out.println(" "+slargest);
        }
        sc.close();

        HashMap<Integer, Integer> countm = new HashMap<>();
        for(int i : arr)
        {
            countm.put(i, countm.getOrDefault(i, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> i : countm.entrySet())
        {
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
    
}

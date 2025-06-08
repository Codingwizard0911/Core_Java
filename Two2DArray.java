import java.util.*;
public class Two2DArray {
    public static void main(String args[]) {
        //2D Array ==> an array of arrays
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] arr = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextLine();
            }
        }
        for (String[] ar : arr) {
            for (String element : ar) {
            System.out.print(element + " ");
            }
            System.out.println();
        }
        }
    }
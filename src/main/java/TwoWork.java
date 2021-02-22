import java.util.Arrays;

public class TwoWork {

    public static void main(String[] args){
        invertArray();
        fillArray();
        doubleArray();
        twoDimArray();


    }

    public static void invertArray() {
        int[] arr = {0, 1, 0, 0, 1, 1, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray(){
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void doubleArray(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] < 6) {
               arr [i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void twoDimArray(){
        int n = 5;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr[i][i] = 1;
            arr[i][n - 1 - i] = 1;
        }
        for (int i = 0; i < n; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

    }

   }

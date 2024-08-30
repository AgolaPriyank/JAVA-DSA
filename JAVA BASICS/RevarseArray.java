import java.lang.reflect.Array;
import java.util.*;

/**
 * RevarseArray
 */
public class RevarseArray {

     public static void main(String[] args)
     {
        int[] arr = {1 , 48 , 69 , 73 , 26 , 55};

        System.out.println(Arrays.toString(arr));

        int start = 0;
        int end = arr.length-1;

        while (start < end) {

            swap(arr, start , end);
            start++;
            end--;
            
        }

        System.out.println(Arrays.toString(arr));
     }


     static void swap(int[] arr , int v1 , int v2)
     {
        int temp = arr[v1];
        arr[v1] = arr[v2];
        arr[v2] = temp;
     }
}
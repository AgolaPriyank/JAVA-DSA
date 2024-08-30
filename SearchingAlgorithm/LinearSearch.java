package SearchingAlgorithm;
import java.util.*;

/**
 * LinearSearch
 */
public class LinearSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];

        System.out.println("Enter array value ");

        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Enter value for search");
        int key = sc.nextInt();

        int ans = search(arr, key);

        if (ans == -1) {
            System.out.println("key element is not found");
        }

        else{
            System.out.println("element is found at index : " + ans);
        }
        
    }

    // if element is found then return index value other wise return -1 element is not found

    static int search(int[] arr , int key)
    {
        if (arr.length == 0) {
            return -1;
        }

        for(int i = 0 ; i < arr.length ; i++)
        {
            if (arr[i] == key) {
                return i;
            }
        }

        // return -1 because element is not in the array
        return -1;
    }
}
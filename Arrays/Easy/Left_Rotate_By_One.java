package Arrays.Easy;

import java.util.Scanner;
import java.util.Arrays;

/*

Example 1:
Input:
 nums = [1, 2, 3, 4, 5]  
Output:
 [2, 3, 4, 5, 1]  
Explanation:
 Initially, nums = [1, 2, 3, 4, 5]  
Rotating once to the left results in nums = [2, 3, 4, 5, 1].

Example 2:
Input:
 nums = [-1, 0, 3, 6]  
Output:
 [0, 3, 6, -1]  
Explanation:
 Initially, nums = [-1, 0, 3, 6]  
Rotating once to the left results in nums = [0, 3, 6, -1].

*/

public class Left_Rotate_By_One {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int N = scan.nextInt();

        System.out.println("Enter the elements of array: ");
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("Before left rotate by one: " + Arrays.toString(array));
        leftRotateByOne(array, N);

        scan.close();
    }

    public static void leftRotateByOne(int[] array, int N) {
        // Storing first value.
        int first = array[0];
        // Left shifting all elements.
        for (int i=1; i<N; i++) {
            array[i-1] = array[i];
        }
        // Placing the first element at last.
        array[N-1] = first;

        System.out.println("After Left roate by one: " + Arrays.toString(array));
    }
}

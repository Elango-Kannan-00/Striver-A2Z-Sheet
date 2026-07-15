package Arrays.Medium;

/*

Example 1:
Input:
 arr = [4, 7, 1, 0]  
Output:
 7 1 0  
Explanation:
 The rightmost element (0) is always a leader.  
7 and 1 are greater than the elements to their right, making them leaders as well.

Example 2:
Input:
 arr = [10, 22, 12, 3, 0, 6]  
Output:
 22 12 6  
Explanation:
 6 is a leader because there are no elements after it.  
12 is greater than all the elements to its right (3, 0, 6), 
and 22 is greater than 12, 3, 0, 6, making them leaders as well.

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array_Leaders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int N = scan.nextInt();

        System.out.println("Enter the array elements: ");
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }

        bruteForceApproach(array, N);
        optimalApproach(array, N);

        scan.close();
    }

    // Brute force approach, Time complexity - O(N^2) Space complexity - O(1).

    public static void bruteForceApproach(int[] array, int N) {
        List<Integer> result = new ArrayList<>();

        // result.add(array[array.length-1]);

        for (int i = 0; i < N - 1; i++) {
            int max = array[i + 1];
            for (int j = i + 1; j < N; j++) {
                if (array[j] > max) {
                    max = array[j];
                }
            }
            if (array[i] >= max) {
                result.add(array[i]);
            }
        }

        result.add(array[array.length - 1]);

        for (var x : result) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Optimal approach, Time complexity - O(N), Space complexity - O(N)

    // Set max as the array's last element.
    // Iterating the array from last to first.
    // If any element greater than max, then add it to the list and update max.

    public static void optimalApproach(int[] array, int N) {
        ArrayList<Integer> result = new ArrayList<>();

        result.add(array[array.length - 1]);
        int max = array[array.length - 1];

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > max) {
                result.add(array[i]);
                max = array[i];
            }
        }

        Collections.reverse(result);
        System.out.println(result);
    }
}

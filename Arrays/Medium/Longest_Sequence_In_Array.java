package Arrays.Medium;

import java.util.HashSet;

/*

Example 1:
Input:
 nums = [100, 4, 200, 1, 3, 2]  
Output:
 4  
Explanation:
 The longest sequence of consecutive elements in the array is [1, 2, 3, 4], 
 which has a length of 4. This sequence can be formed regardless of the initial order 
 of the elements in the array.

Example 2:
Input:
 nums = [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]  
Output:
 9  
Explanation:
 The longest sequence of consecutive elements in the array is [0, 1, 2, 3, 4, 5, 6, 7, 8], 
 which has a length of 9.

*/

import java.util.Scanner;

public class Longest_Sequence_In_Array {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int N = scan.nextInt();

        System.out.println("Enter the elements of array: ");
        int[] array = new int[N];
        for (int i=0; i<N; i++) {
            array[i] = scan.nextInt();
        }

        longestConsecutive(array, N);

        scan.close();
    }   
    
    // Step 01: Check whether the set contains whether any starting point is available or not.
    // Step 02: If any starting element found, set the count to 1
    // Step 03: Now using while loop, check whether the consecutive elements are present, while updating count.
    // This process repeats until last element. If any longest sequence present, then it updates the count.

    public static void longestConsecutive(int[] array, int N) {
        // Hashset to store the array elements.
        HashSet<Integer> set = new HashSet<>();
        
        int length = 0;

        for (int i=0; i<N; i++) {
            set.add(array[i]);
        }

        for (int x : set) {
            if (!set.contains(x-1)) {
                int count = 1;
                int currentNum = x;

                while (set.contains(x + 1)) {
                    count++;
                    currentNum++;
                }

                length = Math.max(length, count);
            }
        }

        System.out.println(length);
    }
}

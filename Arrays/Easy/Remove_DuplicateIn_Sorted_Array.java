package Arrays.Easy;

import java.util.Scanner;

/*

Input: arr[]=[1,1,2,2,2,3,3]
Output: [1,2,3,_,_,_,_]
Explanation: Total number of unique elements are 3, i.e[1,2,3] and 
Therefore return 3 after assigning [1,2,3] in the beginning of the array.
Input: arr[]=[1,1,1,2,2,3,3,3,3,4,4]
Output: [1,2,3,4,_,_,_,_,_,_,_]
Explanation: Total number of unique elements are 4, i.e[1,2,3,4] and 
Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.

*/

public class Remove_DuplicateIn_Sorted_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int N = scan.nextInt();

        System.out.println("Enter the elements of array: ");
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }

        int result = removeDuplicate(array, N);

        for (int i = 0; i < result; i++) {
            System.out.print(array[i] + " ");
        }

        scan.close();
    }

    public static int removeDuplicate(int[] array, int N) {

        // First pointer, point at the first element.
        int i = 0;
        // Second pointer moves one by one and compares with i.
        for (int j = 1; j < N; j++) {
            if (array[j] != array[i]) {
                // if both pointer's element are not same, then place the 2nd pointer's element
                // near first pointer's element.
                i++;
                array[i] = array[j];
            }
        }

        // returning number of elements. +1 for loop condition.
        return i + 1;
    }
}

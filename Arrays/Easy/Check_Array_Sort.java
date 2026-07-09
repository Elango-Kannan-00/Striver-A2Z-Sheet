package Arrays.Easy;

/*

Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: True.
Explanation: The given array is sorted i.e Every element in the array 
is smaller than or equals to its next values, So the answer is True.

Example 2:
Input: N = 5, array[] = {5,4,6,7,8}
Output: False.
Explanation: The given array is Not sorted i.e Every element in the array 
is not smaller than or equal to its next values, So the answer is False.
Here element 5 is not smaller than or equal to its future elements.

*/

import java.util.Scanner;

public class Check_Array_Sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int N = scan.nextInt();

        System.out.println("Enter the elements of array: ");
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }

        checkArraySort(array, N);

        scan.close();
    }

    public static void checkArraySort(int[] array, int N) {

        boolean isSorted = true;
        for (int i = 1; i < N; i++) {
            if (array[i] < array[i - 1]) // If any element is smaller than the previous one, then break.
                isSorted = false;
            break;
        }

        if (isSorted) {
            System.out.println("Yes, sorted.");
        } else {
            System.out.println("No, unsorted.");
        }
    }
}

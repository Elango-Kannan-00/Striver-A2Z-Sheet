package Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

/*


Example 1:
Input:
 arr[] = 1 2 3 4 5, num = 3  
Output:
 2  `
Explanation:
 3 is present at the 2nd index of the array.

Example 2:
Input:
 arr[] = 5 4 3 2 1, num = 5  
Output:
 0  
Explanation:
 5 is present at the 0th index of the array.

*/

public class Linear_Search {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int N = scan.nextInt();

        System.out.println("Enter the elements of array: ");
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("Enter the element to be searched: ");
        int element = scan.nextInt();

        linearSearch(array, N, element);

        scan.close();
    }

    public static void linearSearch(int[] array, int N, int element) {
        for (int i=0; i<N; i++) {
            if (array[i] == element) {
                System.out.println(i);
                break;
            }
        }
    }
}

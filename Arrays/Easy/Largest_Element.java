package Arrays.Easy;

/*

Example 1:
Input:
 arr[] = {2, 5, 1, 3, 0}  
Output:
 5  
Explanation:
5 is the largest element in the array.

Example 2:
Input:
 arr[] = {8, 10, 5, 7, 9}  
Output:
 10  
Explanation:
10 is the largest element in the array.

*/

import java.util.Scanner;

public class Largest_Element {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int N = scan.nextInt();

        System.out.println("Enter the elements of array: ");
        int[] array = new int[N];
        for (int i=0;i <N; i++) {
            array[i] = scan.nextInt();
        }

        findLargest(array, N);

        scan.close();
    }    

    public static void findLargest(int[] array, int N) {
        int maxElement = array[0];
        for (int i=1; i<N; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }

        System.out.println("Maxelement: " + maxElement);
    }
}

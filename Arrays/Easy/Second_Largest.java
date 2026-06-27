package Arrays.Easy;

/*

Example 1:
Input:
 [1, 2, 4, 7, 7, 5]  
Output:
  
Second Smallest : 2  
Second Largest : 5  
Explanation:
  The elements are sorted as 1, 2, 4, 5, 7, 7.  
Hence, the second smallest element is 2, and the second largest element is 5.

Example 2:
Input:
 [1]  
Output:
  
Second Smallest : -1  
Second Largest : -1  
Explanation:
  Since there is only one element in the array, it is both the largest and smallest element.  
Therefore, there is no second smallest or second largest element present.

*/

import java.util.Scanner;

public class Second_Largest {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int N = scan.nextInt();

        System.out.println("Enter the elements of array: ");
        int[] array = new int[N];
        for (int i=0;i <N; i++) {
            array[i] = scan.nextInt();
        }

        findSecondLargest(array, N);
        findSecondSmallest(array, N);

        scan.close();
    }

    // Implementing second largest element.
    public static void findSecondLargest(int[] array, int N) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i=0; i<N; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) { // This line will check, whether any element is greater than second largest, but lesser than largest.
                secondLargest = array[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE && largest == Integer.MIN_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(secondLargest);
        }
    }

    // Finding second smallest element.
    public static void findSecondSmallest(int[] array, int N) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i=0; i<N; i++) {
            if (array[i] < smallest) {
                secondSmallest = smallest;
                smallest = array[i];
            } else if (array[i] < secondSmallest && array[i] != smallest) { // This line will check, whether any element is smaller than second smallest, but greater than smallest.
                secondSmallest = array[i];
            }
        }

        if (secondSmallest == Integer.MIN_VALUE && smallest == Integer.MIN_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(secondSmallest);
        }
    }
}

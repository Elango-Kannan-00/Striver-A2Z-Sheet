package Arrays.Medium;

import java.util.Arrays;

/*

Input: nums = [1, 0, 2, 1, 0]
Output: [0, 0, 1, 1, 2]
Explanation: The nums array in sorted order has 2 zeroes, 2 ones and 1 two

Input: nums = [0, 0, 1, 1, 1]
Output: [0, 0, 1, 1, 1]
Explanation: The nums array in sorted order has 2 zeroes, 3 ones and zero twos.

*/

import java.util.Scanner;

public class Sort_0s_1s_2s {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int N = scan.nextInt();

        int[] array = new int[N];
        for (int i=0; i<N; i++) {
            array[i] = scan.nextInt();
        }

        sortArray(array, N);
        
        scan.close();
    }    

    public static void sortArray(int[] array, int N) {
        int one = 0, two = 0, three = N-1;

        System.out.println("Before sorting: " + Arrays.toString(array));

        while (two <= three) {
            if (array[two] == 0) {
                int temp = array[one];
                array[one] = array[two];
                array[two] = temp;

                one++;
                two++;
            } else if (array[two] == 1) {
                two++;
            } else {
                int temp = array[two];
                array[two] = array[three];
                array[three] = temp;

                three--;
            }
        }

        System.out.println("After sorting: " + Arrays.toString(array));
    }
}

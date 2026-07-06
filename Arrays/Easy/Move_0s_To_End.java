package Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

/*

Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
Explanation: All the zeros are moved to the end and non-negative integers 
are moved to front by maintaining order

Input : 1,2,0,1,0,4,0
Output: 1,2,1,4,0,0,0
Explanation : All the zeros are moved to the end and non-negative integers 
are moved to front by maintaining order

*/

public class Move_0s_To_End {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int N = scan.nextInt();

        System.out.println("Enter the elements of array: ");
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("Before array processing: " + Arrays.toString(array));
        moveZerosToEnd(array, N);

        scan.close();
    }

    public static void moveZerosToEnd(int[] array, int N) {
        int count = 0;
        for (int i=0; i<N; i++) {
            if (array[i] != 0) {
                int temp = array[i];
                array[i] = array[count];
                array[count] = temp;

                count++;
            }
        }

        System.out.println("After array processing: " + Arrays.toString(array));
    }
}

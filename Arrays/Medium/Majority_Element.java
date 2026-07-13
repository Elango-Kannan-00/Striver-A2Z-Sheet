package Arrays.Medium;

/*

Example 1:
Input:
 nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]  
Output:
 7  
Explanation:
 The number 7 appears 5 times in the 9-sized array, making it the most frequent element.

Example 2:
Input:
 nums = [1, 1, 1, 2, 1, 2]  
Output:
 1  
Explanation:
 The number 1 appears 4 times in the 6-sized array, making it the most frequent element.

*/

import java.util.Scanner;

public class Majority_Element {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int N = scan.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }

        int answer = findMajority(array, N);

        System.out.println(answer);

        scan.close();
    }

    public static int findMajority(int[] array, int N) {
        int threshold = N / 2;
        int result = threshold;

        int[] freq = new int[256];

        for (int i = 0; i < N; i++) {
            freq[array[i]]++;
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > threshold) {
                if (freq[i] > result) {
                    result = i;
                }
            }
        }

        return result;
    }
}

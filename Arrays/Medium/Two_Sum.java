package Arrays.Medium;

/*

Input: N = 5, arr[] = {2,6,5,8,11}, target = 14
Output : YES
Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for first variant for second variant output will be : [1,3].

Input: N = 5, arr[] = {2,6,5,8,11}, target = 15
Output : NO.
Explanation: There exist no such two numbers whose sum is equal to the target. 

*/

import java.util.Scanner;

public class Two_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int N = scan.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("Enter the target element: ");
        int target = scan.nextInt();

        solution(array, N, target);

        scan.close();
    }

    // Note: This method is only applicable if the array is in sorted order.

    public static void solution(int[] array, int N, int target) {
        int left = 0, right = N - 1;

        while (left < right) {
            int sum = array[left] + array[right];

            if (sum == target) {
                System.out.println(left + " " + right);
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}
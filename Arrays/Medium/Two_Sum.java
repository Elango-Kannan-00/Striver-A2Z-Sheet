package Arrays.Medium;

import java.util.HashMap;

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

        optimalApproach(array, N, target);
        betterApproach(array, N, target);

        scan.close();
    }

    // Note: This method is only applicable if the array is in sorted order.
    // Time complexity - O(N)
    // Space complexity - O(N)

    public static void optimalApproach (int[] array, int N, int target) {
        int left = 0, right = N - 1;

        while (left < right) {
            int sum = array[left] + array[right];

            if (sum == target) {
                System.out.println("YES");
                System.out.println(left + " " + right);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
     
        System.out.println("NO");
    }

    // This method will works for all type of input. But, space complexity is high compared to two pointer.
    // Time complexity O(N)
    // Space complexity O(N)

    public static void betterApproach (int[] array, int N, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<N; i++) {
            int complement = target - array[i];

            if (map.containsKey(complement)) {
                System.out.println("YES");
                System.out.println(map.get(complement) + " " + i);
                return;
            } 
            map.put(array[i], i);
        }

        System.out.println("NO");
    }
}
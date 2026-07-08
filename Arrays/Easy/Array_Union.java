package Arrays.Easy;

/*


Input:n = 5,m = 5 arr1[] = {1,2,3,4,5}  arr2[] = {2,3,4,4,5}
Output: {1,2,3,4,5}

Explanation: Common Elements in arr1 and arr2  are:  2,3,4,5
Distnict Elements in arr1 are : 1
Distnict Elemennts in arr2 are : No distinct elements.
Union of arr1 and arr2 is {1,2,3,4,5}

Input:n = 10,m = 7,arr1[] = {1,2,3,4,5,6,7,8,9,10}arr2[] = {2,3,4,4,5,11,12}
Output: {1,2,3,4,5,6,7,8,9,10,11,12}

Explanation: Common Elements in arr1 and arr2  are:  2,3,4,5
Distnict Elements in arr1 are : 1,6,7,8,9,10
Distnict Elemennts in arr2 are : 11,12
Union of arr1 and arr2 is {1,2,3,4,5,6,7,8,9,10,11,12}

*/

import java.util.Scanner;
import java.util.ArrayList;

public class Array_Union {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of first array: ");
        int N1 = scan.nextInt();

        int[] array1 = new int[N1];

        System.out.println("Enter the elements of first array (Sorted):");
        for (int i = 0; i < N1; i++) {
            array1[i] = scan.nextInt();
        }

        System.out.print("Enter the size of second array: ");
        int N2 = scan.nextInt();

        int[] array2 = new int[N2];

        System.out.println("Enter the elements of second array (Sorted):");
        for (int i = 0; i < N2; i++) {
            array2[i] = scan.nextInt();
        }

        ArrayList<Integer> result = findUnion(array1, array2);

        System.out.println("\nUnion of the two arrays:");
        for (int x : result) {
            System.out.print(x + " ");
        }

        scan.close();
    }

    public static ArrayList<Integer> findUnion(int[] array1, int[] array2) {

        int left = 0;
        int right = 0;

        ArrayList<Integer> result = new ArrayList<>();

        // Traverse both arrays
        while (left < array1.length && right < array2.length) {

            if (array1[left] < array2[right]) {

                if (result.isEmpty() || result.get(result.size() - 1) != array1[left]) {
                    result.add(array1[left]);
                }
                left++;

            } else if (array2[right] < array1[left]) {

                if (result.isEmpty() || result.get(result.size() - 1) != array2[right]) {
                    result.add(array2[right]);
                }
                right++;

            } else {

                // Both elements are equal
                if (result.isEmpty() || result.get(result.size() - 1) != array1[left]) {
                    result.add(array1[left]);
                }

                left++;
                right++;
            }
        }

        // Add remaining elements of first array
        while (left < array1.length) {

            if (result.isEmpty() || result.get(result.size() - 1) != array1[left]) {
                result.add(array1[left]);
            }

            left++;
        }

        // Add remaining elements of second array
        while (right < array2.length) {

            if (result.isEmpty() || result.get(result.size() - 1) != array2[right]) {
                result.add(array2[right]);
            }

            right++;
        }

        return result;
    }
}
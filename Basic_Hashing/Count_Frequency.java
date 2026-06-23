package Basic_Hashing;

/*

Example 1:
Input: arr[] = {10,5,10,15,10,5};
Output: 10  3
        5  2
        15  1
Explanation: 10 occurs 3 times in the array
	         5 occurs 2 times in the array
             15 occurs 1 time in the array

Example2: 
Input: arr[] = {2,2,3,4,4,2};
Output: 2  3
        3  1
        4  2
Explanation: 2 occurs 3 times in the array
	         3 occurs 1 time in the array
             4 occurs 2 times in the array

*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count_Frequency {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = scan.nextInt();

        int[] array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = scan.nextInt();
        }

        // Function call to find the frequency.
        findFrequency(array);

        scan.close();
    }

    public static void findFrequency(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : array) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Using entryset to iterate over the map data structure.
        for (Map.Entry<Integer, Integer> x : map.entrySet()) {
            System.out.println(x.getKey() + " -> " + x.getValue());
        }

    }
}

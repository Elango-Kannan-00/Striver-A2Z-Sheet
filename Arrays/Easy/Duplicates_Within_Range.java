package Arrays.Easy;

/*

Given an array arr[] of size n, containing elements from the range 1 to n, 
and each element appears at most twice, return an array of all the integers 
that appears twice.

Note: You can return the elements in any order but the driver code will print 
them in sorted order.

Examples:

Input: arr[] = [2, 3, 1, 2, 3]
Output: [2, 3] 
Explanation: 2 and 3 occur more than once in the given array.

Input: arr[] = [3, 1, 2] 
Output: []
Explanation: There is no repeating element in the array, so the output is empty.

*/

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicates_Within_Range {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = scan.nextInt();

        System.out.println("Enter the array elements: ");
        int[] array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = scan.nextInt();
        }

        Solution obj = new Solution();
        obj.findDuplicates(array);

        scan.close();
    }
}

class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        
        for (int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                result.add(entry.getKey());
            }
        }
        
        return result;
    }
}
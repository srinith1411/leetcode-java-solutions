import java.util.Arrays;
import java.util.Scanner;

public class _LC1929_Simulation_ConcatenationOfArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }


        // Create new array with double size
        int ans[] = Arrays.copyOf(nums, nums.length * 2);


        // i points to original array
        // j starts from second half of ans array
        int i = 0;
        int j = nums.length;


        // Copy original array elements into second half
        while(i < nums.length && j < ans.length) {

            ans[j++] = nums[i++];
        }


        System.out.println("Concatenated Array: " + Arrays.toString(ans));

        sc.close();
    }
}


/*
KEY NOTES:

Problem:
LeetCode 1929 - Concatenation of Array


Pattern:
- Array Traversal
- Index Manipulation


Logic:

Example:
nums = [1,2,1]


Step 1:
Create array of size 2 * nums.length

ans = [0,0,0,0,0,0]


Step 2:
Arrays.copyOf(nums, nums.length * 2)

Copies first half:

ans = [1,2,1,0,0,0]


Step 3:
Use two pointers:

i = 0  -> original array index
j = 3  -> second half starting index


Loop:

ans[3] = nums[0] -> 1
ans[4] = nums[1] -> 2
ans[5] = nums[2] -> 1


Final:

ans = [1,2,1,1,2,1]


Time Complexity:
O(N)

Space Complexity:
O(N)


Important:
Arrays.copyOf(array, newLength)
- Creates a new array.
- Copies existing elements.
- Extra positions get default values.
- int default value = 0.
*/
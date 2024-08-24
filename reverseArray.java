import java.util.*;

public class reverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scn.nextInt();

        // Initialize the array
        int[] arr = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Reverse the array
        int left = 0;
        int right = n - 1;
        while (left < right) {
            // Swap the elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the pointers
            left++;
            right--;
        }

        // Output the reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

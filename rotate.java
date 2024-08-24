import java.util.*;  // Corrected import statement

public class rotate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int temp = n;
        int nod = 0;

        // Calculate the number of digits (nod) in the number
        while (temp > 0) {
            temp = temp / 10;
            nod++;
        }

        k = k % nod;  // Handle cases where k is greater than the number of digits
        if (k < 0) {  // Handle negative rotation
            k = k + nod;
        }

        int div = 1;
        int mult = 1;
        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div = div * 10;
            } else {
                mult = mult * 10;
            }
        }

        int q = n / div;
        int r = n % div;

        // Calculate the rotated number
        int result = r * mult + q;  // Use a new variable `result` to avoid redeclaring `r`
        System.out.println(result);
    }
}

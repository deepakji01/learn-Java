import java.util.*;

public class SubstractArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = scn.nextInt();
        }
       
        int n2 = scn.nextInt(); // You missed initializing n2
        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = scn.nextInt();
        }
        
        int[] diff = new int[n2];
        int c = 0;

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;
    
        while (k >= 0) {
            int d = 0;
            int a1Val = (i >= 0) ? a1[i] : 0; // Handle case when i < 0

            if (a2[j] + c >= a1Val) {
                d = a2[j] + c - a1Val;
                c = 0;
            } else {
                d = a2[j] + c + 10 - a1Val;
                c = -1;
            }

            diff[k] = d;
            i--;
            j--;
            k--;
        }

        // To avoid printing leading zeros
        int idx = 0;
        while (idx < diff.length && diff[idx] == 0) {
            idx++;
        }
        if (idx == diff.length) {
            System.out.println(0);
        } else {
            while (idx < diff.length) {
                System.out.print(diff[idx++]);
            }
        }
    }
}

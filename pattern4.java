import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = 0;
        int st = n;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");  // print tab without newline
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");  // print star with tab without newline
            }
            sp++;
            st--;
            System.out.println();  // move to the next line after printing each row
        }

        scn.close();  // Close the scanner to avoid resource leaks
    }
}

import java.util.*;

public class frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading inputs for n and d
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        
        int rv = 0;
        
        // Counting the occurrences of digit d in number n
        while(n > 0) {
            int dig = n % 10;
            n = n / 10;
            if(dig == d) {
                rv++;
            }
        }
        
        // Print the result
        System.out.println(rv);
        
        scanner.close();
    }
}

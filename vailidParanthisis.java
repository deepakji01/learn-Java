import java.util.*;
public class vailidParanthisis { // Typo in class name; should be ValidParenthesis
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = "((a+b)*(c+d))"; // Changed 'Scn' to 'scn'
        
        Stack<Character> st = new Stack<>(); // Changed 'sc' to 'st' for consistency
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                if(st.peek() == '('){
                    System.out.println("True");
                    return; // Added return to stop further execution once a valid pair is found
                }else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop(); // Added missing semicolon
                }
            }else{
                st.push(ch); // Removed extra 'l'
            }
        }
        System.out.println("false");
    }
}

import java.util.*;
public class stack{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(50);
        st.push(50);
       
        System.out.println(st);  
        System.out.println(st+" ->"+ st.peek()+ " " + st.size());  
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st +" "+ st.peek());
    }
}
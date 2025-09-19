package Stacks;
import java.util.Stack;
public class InsertAtGivenIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        System.out.println(st);
        int idx =2;
        int value =1000;
        Stack<Integer> rt = new Stack<>();
        while(st.size()>idx){
            rt.push(st.pop());
        }
        st.push(value);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);

    }
}

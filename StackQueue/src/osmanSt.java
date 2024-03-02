public class osmanSt {
    public static void main(String[] args) throws Exception {
        DynamicStack st = new DynamicStack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.disp();

        System.out.println(st.peek());

    }
}

package Basics.String;

public class StringBuilders {
    public static void main (String [] args){
        StringBuilder sb = new StringBuilder("Taisiq");
        System.out.println(sb);

        //charAt(index)
        System.out.println(sb.charAt(0));

        // setCharAt( index, value)
        sb.setCharAt(5,'a');
        System.out.println(sb);

        //inset(index, value)
//        sb.insert(0,'T');
//        System.out.println(sb);
        //inset(index, value)
        sb.insert(6,'T');
        System.out.println(sb);

        // delete(startIndex,endIndex)
        sb.delete(6,7);
        System.out.println(sb);

        sb.setCharAt(5,'q');
        System.out.println(sb);

        StringBuilder st = new StringBuilder("h");
        //append("string") insert at last index
        st.append('e');
        st.append("ll");
        st.append('o');
        System.out.println(st);
    }
}

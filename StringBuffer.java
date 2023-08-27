public class StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        // sb.append("vipul");
        //stringbuffer can be inserted and deleted also it gives a capcity of 16bits
        //it gives 16 bit because while the allocation is done for memory there should be continous allocation so that it cannot be relocated
        System.out.println(sb.hashCode());   

        String str= sb.toString();
        System.out.println(str);
        //StringBuilder is same as StringBuffer but the diffrence is SB is thread safe 
    }
}

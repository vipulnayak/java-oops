public class Conversion {
    public static void main(String args[]){
        //this method is known as type casting
        float f=5.6f;
        int x= (int) f;
        System.out.println(x);


        byte b=127;
        int a= b;
        System.out.println(a);

        //range of byte is from -127 to +128 so it use modulus like the total number set is 256 so the (res= given value % 256) 
        int ab=260;
        byte bc = (byte) ab;
        System.out.println(bc);

        //type promotion(evnethough the value of byte is upto to 128 it gives the result)
        byte cd=20;
        byte de=20;
        int res=cd*de;
        System.out.println(res);
    }
}

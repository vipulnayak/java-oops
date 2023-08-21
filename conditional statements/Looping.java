public class Looping {
    public static void main(String[] args) {
        int x = 9, y = 6, z = 10;

        // if(x<y && y<25){
        // System.out.println("wins");
        // }
        // else{
        // System.out.println("loosee");
        // }

        if (x > y && x > z) {
            System.out.println("print x is greater" + x);
        } else if (y > z) {
            System.out.println("print y is greater" + y);
        } else {
            System.out.println("print z is greater ,z=" + z);

        }

    }
}

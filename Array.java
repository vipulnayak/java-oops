public class Array {
    public static void main(String[] args) {
        int num[] = new int[10];

        for(int i=0;i<10;i++){
            num[i]=(int)(Math.random()*10);
        }
        for(int i=0;i<10;i++){
            System.out.println(num[i] + "");
        }        
        System.out.println();
    }
}

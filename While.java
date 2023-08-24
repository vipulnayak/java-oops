

public class While {
    public static void main(String[] args) {
        int i=1;

        while(i<=4){
            System.out.println("hi "+i);

            i++;
        }

        do{
            System.out.println("hi "+i);

            i++;
        }while(i<=4);
    }
}

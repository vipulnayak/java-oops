class Mobile{
    static String name;
    String brand;
    int price;

    public void show(){
        System.out.println(brand +" : " + price + " : " + "name");
    }
}

public class Staticvariable {
    public static void main(String[] args) {
        Mobile mb1= new Mobile();
        mb1.brand="Samsung";
        mb1.price=70000;
        // mb1.name="smartphone";
        Mobile.name="Smartphone";

        Mobile mb2= new Mobile();
        mb2.brand="Samsung";
        mb2.price=70000;
        Mobile.name="Smartphone";
//since the name has beeen declared static instance variable can be declared using class.variable

        mb1.show();
        mb2.show();
    }
}

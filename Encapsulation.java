class Human{
    private int age;
    private String name;
    //when private keyword is used the instance is only is excesable to that class only

    public void setAge(int a){
        age =a;
    }
    public int getAge(){
        return age;
    }

    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj= new Human();

        obj.setAge(21);
        obj.setName("Vipul");

        System.out.println(obj.getName()+":"+obj.getAge());
    }
}

class A{
    public A(){
        System.out.println("in a");
    }

    public A(int n){
        System.out.println("in int a");
    }
}

class B extends A
{
    public B(){
        super();
        System.out.println("in b");
    }

    public B(int n){
        this();
        System.out.println("in int b");
    }
}

public class Super {
    public static void main(String[] args) {
        B obj=new B(5);
    }
}

//super is a default method which is declared even if dont call it 
//this is used to call the b method which defines B.B();
//the class A is defaultly extended to object
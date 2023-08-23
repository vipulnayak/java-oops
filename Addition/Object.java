package Addition;

class Add{
    public int addition(int n1,int n2)
    {
        return n1+n2;
    }
    public int addition(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public double additon(double n1,int n2){
        return n1+n2;
    }
}

public class Object {
    public static void main(String[] args) {
        int num1=6;
        int num2=4;

        Add result = new Add();
        int sum =result.addition(num1,num2);

        System.out.println(sum);
    }
}

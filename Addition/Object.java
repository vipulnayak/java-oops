package Addition;

class Add{
    int a;
    public int addition(int n1,int n2)
    {
        int r;
        r=n1+n2;
        return r;
    }
};

public class Object {
    public static void main(String[] args) {
        int num1=6;
        int num2=4;

        Add result = new Add();
        int sum =result.addition(num1,num2);

        System.out.println(sum);

    }
}

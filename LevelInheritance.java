class Calc
{
	public int add(int n1, int n2)
	{
		return n1+n2;
	}
	public int sub(int n1, int n2)
	{
		return n1-n2;
	}
}


class AdvCalc extends Calc
{
	public int multi(int n1, int n2)
	{
		return n1*n2;
	}
	public int div(int n1, int n2)
	{
		return n1/n2;
	}
}

class VeryAdvCalc extends AdvCalc
{
	public double power(int n1,int n2)
	{
		return Math.pow(n1, n2);
	}
}

public class LevelInheritance {
    public static void main(String[] args) {
        VeryAdvCalc res= new VeryAdvCalc();
        int r1 =res.add(5, 7);
        int r2 =res.sub(5, 7);
        int r3 =res.multi(5, 7);
        int r4 =res.div(5, 7);
        double r5 =res.power(4, 3);
        
        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
    }
}

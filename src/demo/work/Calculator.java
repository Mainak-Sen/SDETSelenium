package demo.work;

public class Calculator {
	
/*private int a=10;
private int b=2;*/
	int a;
	int b;
	
public Calculator(int a,int b)
{
	this.a=a;
	this.b=b;
	
	System.out.println("Constructor is executed ");
}
	
public int add()
{
	return a+b;
}

private int subtract()
{
	return a-b;
}

 int multiply()
{
	 return a*b;
}

protected int division()
{
	return a/b;
}


}

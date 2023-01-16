package package4;

public class ClassAndObject 
{
	static int b=200;
	static public void method1() {
		
		int a=100;
		System.out.println("the value of variable a "+a);
	}

	public static void main(String[] args) 
	{
		//ClassAndObject v= new ClassAndObject();
		method1();
		
		System.out.println(b);
	}
}

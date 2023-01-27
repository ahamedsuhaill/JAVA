package FORLOOP;//constructor overloading

public class sample {
	/*sample(int a)
	{
		System.out.println("ahamed" );
	}
	sample(int a,double b)
	{
		System.out.println("suhail");
	}
	sample(char c,double b)
	{
		System.out.println("kani");
	}
	
	sample(double c)
	{
		System.out.println("jalal");
	}
	
	public static void main(String[] args) {
		System.out.println("i love you dad");
		new sample(1);
		new sample(1,0.01);
		new sample('a',0.009);
		new sample(0.008); */
		// TODO Auto-generated method stub
	sample(int a)
	{
		System.out.println("ahamed" );
	}
	sample(int a,double b)
	{
		this(8);
		System.out.println("suhail");
	}
	sample(char c,double b)
	{
		this(8,0.009);
		System.out.println("kani");
	}
	
	sample(double c)
	{
		this('h',0.008);
		System.out.println("jalal");
	}
	
	public static void main(String[] args) {
		System.out.println("i love you dad");
		new sample(00.009);
	}

}

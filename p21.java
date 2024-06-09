interface I
{
	void sum();
	void diff();
}
abstract class A implements I
{
	public void sum()
	{
		System.out.println("this is sum");
	}
}
class B extends A
{
	public void diff()
	{
		System.out.println("this is diff");
	}
}

class p21
{
	public static void main(String [] args)
	{
		B b=new B();
		b.sum();
		b.diff();
	}
}

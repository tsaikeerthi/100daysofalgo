import java.lang.System;
import java.lang.String;
class Addition 
{
	int a,b;
	void add()
	{
		int c=a+b;
		System.out.print(c);
	}
	public static void main(String[] args) 
	{
		Addition ob= new Addition();
		ob.a=12;
		ob.b=13;
		ob.add();
	}
}

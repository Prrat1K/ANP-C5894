package oops;

public class overloading {
	
	public int addition (int a,int b)
	
	{
		
	return	a+b;
	}
public int addition (int a,int b, int c)
{
	
return a+b+c;
		}

}

class mainnn
{
	
	public static void main ( String [] args)
	
	{
		overloading o= new overloading();
		
	System.out.println("addition is"+o.addition(45, 0));
	System.out.println("addition is"+o.addition(22, 2, 56));
	
		
		
		
	}

}
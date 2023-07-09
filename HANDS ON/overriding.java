package oops;

public class overriding {
	
	public int subtract (int a, int b)
	{
		return (a-b);
	}

}
class overlooading extends overriding
{
	public int subtract (int a,int b)
	{
		return a+b;
		
	}

}

class man
{
	public static void main(String [] args)
	{
		overlooading o= new overlooading();
		
		System.out.println("subtraction is"+o.subtract(56, 06));
		
		
		
  }
	
}
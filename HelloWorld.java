package unl.cse;

public class HelloWorld {
	
	public static void main(String args[]) {
		System.out.println("Hello World my name is Kyle");
		//There is an integer
		int x = 10;
		
		//There is a double
		double y = 10.5;
		int z = 6;
		//There is a String
		String s = "Kyle";
		
		double sum = x + y;
		System.out.println(sum + " " + s);
		
		double answer = (x+y)/z;
		
		System.out.println("Hello, my name is " + s + ", the sum of " + x + " and " + y + " divided by " + z + " is " + answer);
	}	
	
}

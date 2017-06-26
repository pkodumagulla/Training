import java.util.Scanner;
public class mathfunt {
		public static void main(String args[])
		{
			Scanner item = new Scanner(System.in);
			double x, y;
			System.out.println("Enter two numbers");
			x = item.nextDouble(); 
			y = item.nextDouble();
			System.out.println("x = " + x + " y = " + y);
			System.out.println("Doing Math functions");
			System.out.println("Math.pow = "+ Math.pow( x , y));
			System.out.println("Math.ceil = "+ Math.ceil(x));
			System.out.println("Math.floor = "+ Math.floor(x));
			System.out.println("Math.abs = " +Math.abs(x));
			System.out.println("Math.max= " + Math.max(x, y));
			System.out.println("Math.min = " + Math.min(x, y));
		    System.out.println("Math.sqrt = "+ Math.sqrt(x));
		}
}

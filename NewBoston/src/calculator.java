import java.util.Scanner;

public class calculator {
	public static void main(String args[]){
		
		Scanner calc = new Scanner(System.in);
		double x, y, sol;
		System.out.println("enter first number:  ");
		x = calc.nextDouble();                  // for int ==> nextInt();
		System.out.println("enter second number :");
		y = calc.nextDouble();
		sol = x + y;
		System.out.println("Solution is : " + sol);
	}

}

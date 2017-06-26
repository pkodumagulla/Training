import java.util.Scanner;
public class arrSum {
	public static void main(String[] args){
		int numb[] = new int[10];
		Scanner range = new Scanner(System.in);
		System.out.println("Enter the range of array elements");
		int number = range.nextInt();
		Scanner item = new Scanner(System.in);
		for (int counter = 0 ; counter <= number; counter++) // tried putting 10 instead of "number", it didnt work ,
			                                                 // try  if you need it 
			
		{
			numb[counter]= item.nextInt();
		}
		int Sum = 0;
		for (int counter = 0; counter <= number; counter++)
		{
			Sum+=numb[counter];
		}
		System.out.println("Sum of all the array numbers is  "+Sum);
	}
} 
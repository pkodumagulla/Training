import java.util.Scanner;
public class forAdvanced2 {
	public static void main(String[] args){
		
		Scanner numbers = new Scanner(System.in);
		Scanner range = new Scanner(System.in);
		
		System.out.println("enter total numbers of elements of the array : ");
		int limit = range.nextInt();
		int arr[] = new int[limit];
		int Sum = 0;
		
		System.out.println("Enter elements of the array : ");
			for(int i=0; i<limit; i++){
				arr[i] = numbers.nextInt();
			}
		
		System.out.println("The elements of the array are as follows: ");
			for(int i=0; i<arr.length; i++){
				System.out.println(arr[i]);;
			}
		
		System.out.println("The Sum of elements of the array is : ");
			for(int j: arr){
				Sum+=j;
			}
		System.out.println(Sum);
		
	}
}

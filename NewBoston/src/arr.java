import java.util.Scanner;

public class arr {
		public static void main(String args[]){
			System.out.println("index\tarray number");
			Scanner item = new Scanner(System.in);
			int arr[] = new int[10];
			for(int i=0 ; i<10 ; i++){
		   	arr[i] = item.nextInt();
		   	}
			System.out.println("index\tarray number");
            for(int i =0 ;i<arr.length; i++){
			System.out.println(i+ "\t" +arr[i]);
			}
		}
}

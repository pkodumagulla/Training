import java.util.Scanner;
public class switchscan {
	public static void main(String args[]){
		Scanner age = new Scanner(System.in);
		int years;
		System.out.println("Enter age : " );
		years = age.nextInt();
		switch (years) {
		 case 20:
			System.out.println("Age is "+ years);
		    break;
		   default:
			 System.out.println("training");
			 break;
		}
     multclass JustTest = new multclass();
            JustTest.somedata();
          				
	}
}

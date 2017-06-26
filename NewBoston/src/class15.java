import java.util.Scanner;
public class class15 {
		public static void main(String args[]){
			
			
			MethPara CallName = new MethPara();
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter your name");
			String name = input.nextLine();
			
			CallName.SimpleMess(name);
		}
}

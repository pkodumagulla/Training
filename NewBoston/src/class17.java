import java.util.Scanner;
public class class17 {
	 public static void main(String args[]){
		 Scanner name = new Scanner(System.in);
		 String cont;
		 System.out.println("enter the name of the college : ");
		 cont = name.nextLine();
		 Constructors cObj = new Constructors(cont);
		 cObj.display();
		 
		 
		 
	 }
}

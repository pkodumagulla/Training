
public class timeClass2 {
	public static void main(String[] args){
		 timeClass time = new timeClass();
		
		 System.out.println(time.toMilitary());
		 System.out.println(time.toString());

		 time.setTime(20, 25, 22);
		 System.out.println(time.toMilitary());
		 System.out.println(time.toString());
	}
}

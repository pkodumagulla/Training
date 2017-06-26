
public class varlenarg {
	public static void main(String[] args){
		
		System.out.println(average(445,6556,45,8,6,33,5,66,23,333,556294));
	}
	public static int average(int...numbers){
		int total=0;
		for(int x:numbers){
			total+=x;
		}
			return (total/numbers.length);
	
	}
} 

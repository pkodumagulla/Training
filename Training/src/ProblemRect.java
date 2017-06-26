
public class ProblemRect {
	public static void main(String[] args){
		int area1, area2, perimeter1, perimeter2;
	 	 Rectangle rect1 = new Rectangle();
	 	 Rectangle rect2 = new Rectangle();
        //one method 
	 	   rect1.length = 10;
           rect1.width  = 15;
		   area1 = rect1.length*rect1.width;
		// Second method
		   rect2.getData(20,30);
		   area2= rect2.rectArea();
		// Third method
		   rect1.getData(10, 20);
		   perimeter1 = 2* (rect1.length + rect1.width);
        // Fourth method
		   rect2.length= 40;
		   rect2.width= 50;
		   perimeter2= rect2.perimeter();		   
		 System.out.println("area of rect1 is "+area1);
		 System.out.println("area of rect2 is "+area2);
		 System.out.println("Perimeter of rect 1 is " +perimeter1);
		 System.out.println("Perimeter of rect2 is "+ perimeter2);
	}
}

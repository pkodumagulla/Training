
public class Constructors {
      int length, width;
      Constructors (int x, int y)
      {
    	  length = x;
    	  width = y;
      }
      int areaRect()
      {
    	  return(length * width);
      }
  	  void display(){
  		  System.out.println("The area of the rectangle " +length*width);
  	  }
}


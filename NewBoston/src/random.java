import java.util.Random;
public class random {
      public static void main(String args[]){
    	  Random item = new Random();
    	  int value1 , value2 ,counter=0;
    	  do{
    	  System.out.println("Printing  some random value : " +counter);
          value1 = 1+item.nextInt(6);
    	  value2 = 1+item.nextInt(6);
    	  System.out.println("Random value = " + value1 + "  Random value = " +value2);
    	  System.out.println("Sum of the random numbers is : " + (value1 + value2));
    	  counter++;
    	  }
          while(counter<20);
      }
}

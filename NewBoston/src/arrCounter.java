import java.util.Random;
public class arrCounter {
    public static void main(String[] args)
    {
    	Random rand = new Random();
    	int freq[] = new int[7];
    	  
    	  for(int roll = 1; roll<=1000 ; roll++)
    	  {
    		++freq[1+rand.nextInt(6)];   // trust me Raghav very simple to understand ( try youtube comments )
    						             //https://www.youtube.com/watch?v=pHxtKDENDdE
    	  }
        System.out.println("face\tfrequency");
        
        for(int face=1;face<freq.length;face++)
        {
        	System.out.println(face+"\t"+freq[face]);
    }
    	
    }
}

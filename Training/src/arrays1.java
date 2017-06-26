
public class arrays1 {
    public static void main(String[] args){
    	int arr[] = new int[15];
    	int arr1[]; 
    	arr1 = new int[20];
    	int arr2[] ={10,20,30,40,50};
    	   for(int i=0; i<=arr2.length; i++)
    	   {
    		   if(i<10)
    		   {
    			  for(int x = 0; x<i; x++)
    			  {
    				  arr[i] = x;
                      System.out.print(arr[i]);    
    		      }
    		   }
    		   else 
    		   {
    		   for(int y = i; y>1; y--)
  			    {
    			   arr[i] = y;
                   System.out.print(arr[i]);    		      

  			    }
   			   }
    	   }
    	
    	
    }
}

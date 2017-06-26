
public class arr2d {
	public static void main(String[] args){
		int arr1[][] = {{1, 2, 3},{34,54,65},{23,54,76}};
		int arr2[][] = {{76,87,54,354},{435},{35,64,1265}};
		
		System.out.println("This is array 1");
		display(arr1);
		
		System.out.println("This is array2");
		display(arr2);
	}	
		public static void display(int x[][]){
			for(int row=0; row<x.length; row++){
				for(int column=0; column<x[row	].length; column++){
					System.out.print(x[row][column]+ "\t");
				}
					System.out.println();
			}
		
	}
}

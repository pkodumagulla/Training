public class arrmeth {
	public static void main(String[] args){
		
		int arr[] = {1, 2, 3, 4, 5, 6};
		change(arr);
		for(int y:arr){
			System.out.println(y);
		}
		}
	public static void change( int x[]){
		for(int counter=0; counter<x.length; counter++){
			x[counter]+=5;
		}
	}
}

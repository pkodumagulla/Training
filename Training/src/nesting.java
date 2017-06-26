
public class nesting {
		int a, b;
		nesting (int x, int y)
		{
			a=x;
			b=y;
		}
		int largest()
		{
			if(a>b)
			return(a);
			else
			return(b);
		}
		void display()
		{
			int great = largest();
			System.out.println("the largest of two numbers is " +great);
	    }
		void changes()
		{
			int top=largest();
			for(int i=1; i<top/2;i++)
				System.out.print("-");
			    System.out.print(">");
				System.out.println("\n");
			for(int i=1;i<top/2;i++)
				System.out.print("U");
		}
		}
class nestingexample {
	public static void main(String[] args)
	{
		nesting nest = new nesting(3,9);
		nest.display();
		nest.changes();
	}
}

	

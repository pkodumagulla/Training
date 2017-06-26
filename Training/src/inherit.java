
public class inherit {
    int length;
    int breadth;
    inherit(int x, int y)
    {
    	length = x;
    	breadth = y;
    }
    int area()
    {
    	return(length * breadth);
    }
}
class roomd extends inherit{
	int height;
	roomd(int x, int y, int z)
	{
	super(x, y);
	height = z;
	}
	
	int volum()
	{
		return(length*breadth*height);
	}
}

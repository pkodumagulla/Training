
public class Rectangle {
	int length;
	int width;
	void getData( int x, int y)
	{
		length= x;
		width = y;
	}
	int rectArea()
	{
		 int area = length * width;
		 return(area);
	}
	int perimeter()
	{
		 int perimeter = 2 *(length+width);
		 return(perimeter);
	}
}

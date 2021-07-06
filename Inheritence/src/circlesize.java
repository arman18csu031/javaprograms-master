interface GeometricObject
{
	public double getPerimeter();
	public double getArea();
}

class Circle implements GeometricObject
{
	double radius=1;
	Circle(double radius)
	{
     this.radius=radius;
	}
	public double getPerimeter()
	{
		double perimeter = 2*3.14*radius;
		return perimeter;
	}

	public double getArea()
	{
		double area = 3.14*radius*radius;
		return area;
	}


}

interface Resizable
{
	public double resize(int percent);
}
 class ResizableCircle extends Circle implements Resizable
 {
 	ResizableCircle(double radius)
 	{
 		super(radius);
 	}
 	public double resize(int percent)
 	{
 		radius = (radius*percent)/100;
 		return radius;
 	}
 } 

 class circlesize
 {
 	public static void main(String args[])
 	{
 		ResizableCircle c1 = new ResizableCircle(2);
 		double p = c1.getPerimeter();
 		double c = c1.getArea();
 		double d = c1.resize(20);
 		System.out.println(p);
 		System.out.println(c);
 		System.out.println(d);

 	}

 }



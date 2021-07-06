class box extends rectangle
{
	private double height;
	double area,perimeter;
	box()
	{
	super();
	height=10;
	}
	box(double l,double w,double h){
	super(1,w);
	height=h;
	}
	public void setdimension(double a,double b,double c)
	{
	super.setdimension(a,b);
	height=c;
	}
	public double getheight()
	{
	return height;
	}
	public double area()
	{
	area=height*getwidth()*getlength();
	return area;
	}
	public double perimeter()
	{
	perimeter=height+getwidth()+getlength();
	return perimeter;
	}
	public void print()
	{
	System.out.print("the area is:"+area);
	System.out.print("the perimeter is:"+perimeter);
	}
}
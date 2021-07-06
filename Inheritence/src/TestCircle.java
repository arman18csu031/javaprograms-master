interface GeometricObject{
	public double getPerimeter();
	public double getArea();
}

class Circle implements GeometricObject{
	double radius=1.0;
	Circle(double radius){
		this.radius=radius;
	}
   public  double getPerimeter(){
	double Perimeter=2*3.14*radius;
	return Perimeter;
	}
	public double getArea(){
	double Area=3.14*radius*radius;
	return Area;
	}
}

interface Resizeable{
public double resize(int percentage);
}

class ResizeableCircle  extends Circle implements Resizeable{
	ResizeableCircle(double radius){
	super(radius);
	}
	public double Resizeable(int percent){
	radius=(radius*percent)/100;
	}

}

class TestCircle{
	public static void main(String args[]){
	Circle c=new Circle();
	c.radius();
	c.getPerimeter();
	c.getArea();
	c.Resizeable();
	}
}
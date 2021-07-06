public class circle 
{
	private double radius=1.0;
	private String color="red";
	double area;
	public circle(){
	radius=5.0;
	color="green";
	}
	public circle(double r){
	radius=r;
	color="red";
	}
	public circle(double r,String c){
	radius=r;
	color=c;
	}
	public double getradius(){
	return radius;
	}
	public void setradius(double r){
	radius=r;
	}
	String getcolor(){
	return color;
	}
	public void setcolor(String c){
	color=c;
	}
	public double getarea(){
	area=3.14*radius*radius;
	return area;
	}
}
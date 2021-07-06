class Triangle2 extends Shape2{
	Triangle2(double a,double b){
	super(a,b);
	}
	double area(){
	area=0.5*dim1*dim2;
	return area;
	}
	void display(){
	System.out.print(area);
	}
}
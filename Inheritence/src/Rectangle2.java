class Rectangle2 extends Shape2{
	Rectangle2(double a,double b){
	super(a,b);
	}
	double area(){
	area=dim1*dim2;
	return area;	}
	void display(){
	System.out.print(area);
		}
}
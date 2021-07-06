class ShapeTest{
	public static void main(String args[]){
	Rectangle2 r=new Rectangle2(9,5);
	Triangle2 t=new Triangle2(8,4);
	Shape2 shaperef;
	shaperef=r;
	System.out.println(shaperef.area());
	shaperef.display();
	shaperef=t;
	System.out.println(shaperef.area());
	shaperef.display();

	}
}
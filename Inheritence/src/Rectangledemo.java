class Rectangledemo{
	public static void main(String args[]){
	Rectangle r1=new Rectangle();
	Shape s=r1;
	Rectangle r2=(Rectangle) s;	
	r2.display();
	r2.IncreaseLength();
	}
}
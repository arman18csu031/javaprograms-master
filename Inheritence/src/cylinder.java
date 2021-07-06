class cylinder extends circle {
	private double height=1.0;
	double volume;
	public cylinder(){
	super();
	height=3.0;
	}
	public cylinder(double r){
	super(r);
	}
	public cylinder(double r,double h){
	super(r);
	height=h;
	}
	public cylinder(double r,double h,String c){
	super(r,c);
	height=h;
	}
	public double getheight(){
	return height;
	}
	public void setheight(double h){
	height=h;
	}
	public double getvolume(){
	volume=3.14*getradius()*getradius()*height;
	return volume;
	}
}
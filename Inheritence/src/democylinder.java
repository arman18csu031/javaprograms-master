class democylinder{
	public static void main(String args[])
	{
	cylinder c1=new cylinder();
	cylinder c2=new cylinder(5.0);
	cylinder c3=new cylinder(5.0,10.0);
	cylinder c4=new cylinder(5.0,10.0,"blue");
	double volume,area;
	
	volume=c1.getvolume();
	System.out.print("the volume is :"+volume);
	area=c1.getarea();
	System.out.print("the area is :"+area);

	volume=c2.getvolume();
	System.out.print("the volume is :"+volume);
	area=c2.getarea();
	System.out.print("the area is :"+area);


	volume=c3.getvolume();
	System.out.print("the volume is :"+volume);
	area=c3.getarea();
	System.out.print("the area is :"+area);


	volume=c4.getvolume();
	System.out.print("the volume is :"+volume);
	area=c4.getarea();
	System.out.print("the area is :"+area);
	}
}
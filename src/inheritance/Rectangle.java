package inheritance;

public class Rectangle extends Shape{
	
	public void description() {
		System.out.print("this is rectangle shape\n");
	}
	
	public int area(int l,int w) {
		return l*w;
	}
	
	public double area(double l,double w) {
		return l*w;
	}

}

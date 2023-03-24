package inheritance;

public class DrawShape {

	public static void main(String[] args) {
		Shape s= new Shape();
		s.description();
		Rectangle r=new Rectangle();
		r.description();
		System.out.println(r.area(3.5, 1.0));
		System.out.println(r.area(3, 6));
		

	}

}

package conversion;
import java.util.*;
enum Fruits{
	APPLE(100),MANGO(50),WATERMELON(60),ORANGE(40);
	private int value;
	Fruits(int value){
		this.value=value;
	}
	
	public int getValue() {
		return this.value;
	}
}

public class StringToEnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter fruit name");
		String name=sc.nextLine();
		System.out.println(Fruits.valueOf(name));
	}

}

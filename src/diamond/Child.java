package diamond;

public class Child implements Father, Mother {

	public static void main(String[] args) {
		Child child=new Child();
		child.description();

	}

	@Override
	public void description() {
		
		Father.super.description();
		Mother.super.parentDescription();
	}

}

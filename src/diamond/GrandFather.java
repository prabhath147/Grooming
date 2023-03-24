package diamond;

public interface GrandFather {
	
	default void description() {
		System.out.println("Grandfather");
	}

}

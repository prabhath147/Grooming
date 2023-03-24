package diamond;

public interface Father extends GrandFather {
	
	default void description() {
		System.out.println("father");
	}

}

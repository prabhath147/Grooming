package diamond;

public interface Mother extends GrandFather {
	
	default void parentDescription() {
		GrandFather.super.description();
	}

}

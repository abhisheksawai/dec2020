package abstractionInterFace;

public interface Operation {
	
	public void o1();
	
	// post java 1.8 its possible
	
	default void o2()
	{
		System.out.println("o2 method");
	}

	
	
}

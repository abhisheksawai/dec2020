package abstractionInterFace;

public interface Color {
	
	public void black();
	
	default void white()
	{
		System.out.println("white");
	}

}

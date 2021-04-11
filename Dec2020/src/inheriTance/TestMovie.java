package inheriTance;

public class TestMovie {
	
	public static void main(String[] args) {
		
		ActionMovie am = new ActionMovie();
		ComedyMovie cm = new ComedyMovie();
		
		// ActionMovie sm1 = new ComedyMovie();

		// ComedyMovie sm2 = new ActionMovie();
		
		
		am.fight();
		am.release();
		
		cm.smile();
		cm.release();
		
		//am.smile();
	}

}

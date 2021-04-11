package abstractionInterFace;

public class TestMachine implements Machine {
	
	public static void main(String[] args) {
		
		TestMachine tm = new TestMachine();
		tm.print();
		tm.wash();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print method");
	}

	@Override
	public void wash() {
		// TODO Auto-generated method stub
		System.out.println("wash method");
	}



}

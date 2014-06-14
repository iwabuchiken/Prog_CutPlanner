package cp.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_test_D_1_V_1_0();
		
		String message = "done";
		String label = "["
				+ Thread.currentThread().getStackTrace()[1].getFileName()
				+ " : "
				+ Thread.currentThread().getStackTrace()[1].getMethodName()
				+ " : "
				+ Thread.currentThread().getStackTrace()[1].getLineNumber()
				+ "]";
		System.out.println(label + " " + message);
		
		
	}

	private static void _test_D_1_V_1_0() {
		// TODO Auto-generated method stub
		
	}

}

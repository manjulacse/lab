

public class Throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fun(2,0);
	} 
	public static void fun(int a, int b) throws ArithmeticException {
		int c;
		try {
			c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	
	}

}



public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			
		method(10);

	

	}
	public static void method(int age) {
	if(age<18) {
		throw new ArithmeticException("not valid");
	}
	else {
		System.out.println("hiii");
	}
	}

}

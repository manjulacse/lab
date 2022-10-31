package javapackage;

public class Multi extends Thread {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	Multi t1= new Multi();
	t1.start();

	}

 public void run() {
	 System.out.println("thread strings");
 }
}

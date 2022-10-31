package javapackage;

public class TestSleepMethod {
	public void run()
	{
		for(int i=1; i<5; i++) {
			try {
				Thread.sleep(5000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 TestSleepMethod t1= new TestSleepMethod();
   t1.run();
	}

}

public class InnerForLoop {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++)
			if (i % 2 == 1) 
				System.out.println(i);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("i love u");// thread.sleep

			}
	}

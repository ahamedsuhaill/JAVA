public class Methodoverloading {

	// TODO Auto-generated method stub
	void school(int i) {
		System.out.println("print non static1");
	}

	static void school(int i, char c, double d) {
		System.out.println("print static1");
	}

	static void school(int i, double d) {
		System.out.println("print static2");
	}

	void school(int i, char c) {
		System.out.println("print non static 2");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			System.out.println("it is static or non static");
			Methodoverloading M = new Methodoverloading();
			M.school(2);
			school(1, 's', 0.3);
			school(1, 0.98);
			M.school(1, 'd');
			

		}

	}
}

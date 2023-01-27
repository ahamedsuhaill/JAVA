class mkt {
	void stmkt() {
		System.out.println("super class");
	}
}

class mkt1 extends mkt {
	void stmkt() {
		System.out.println("sub class");
	}
}

public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mkt1 m1 = new mkt1();
		m1.stmkt();

	}

}

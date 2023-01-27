
//public class Hybridlevelinheritance 
class one {
	void mad() {
		System.out.println("print class super class 1");
	}
}

class two extends one {
	void owl() {
		System.out.println("print super class 2");
	}
}

class three extends two {
	void cat() {
		System.out.println("print sub class");
	}
}

class four extends one {
	void dog() {
		System.out.println("print hierachical");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("print hybrid inheritance");
		
		four f = new four();
		f.dog();
		f.mad();
		
		three t = new three();
		t.cat();
		t.owl();
		t.mad();

	}

}

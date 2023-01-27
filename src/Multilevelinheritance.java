
public class Multilevelinheritance {
	void college() {
		System.out.println("print grant father parent class (super class)");
	}
}

class father extends Multilevelinheritance {
	void school() {
		System.out.println("print father parent class (super class)");
	}
}

class child extends father {
	void play()
	{
		System.out.println("print child(child class");
	}


	public static void main(String[] args) {
		System.out.println("multilevel inheritance");
		// TODO Auto-generated method stub
		child c= new child();// calling method in variable
		c.play();
		c.school();
		c.college();

	}
}
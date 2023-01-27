
//public class Hierarchicalinheritance 
class father{
	void father() {
		System.out.println("print super class.,parents class");
	}
}

class son1 extends father {
	void son1() {
		System.out.println("print son 1");
	}
}
	class son2 extends father {
		void son2() {
			System.out.println("print son2");
		}

		public static void main(String[] args) {
			System.out.println("print ");
			// TODO Auto-generated method stub
			son2 s = new son2();
			s.son2();
		    s.father();
		    
			son1 s1=new son1();
			s1.son1();
			s1.father();

		}}

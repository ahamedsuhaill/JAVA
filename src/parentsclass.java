 class parentsclass {
	void school() {
		System.out.println("print parents class");
	}
}
// above parents class
// below child class
	class childclass extends parentsclass {
	void play ()
	{
		System.out.println("print chils class");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("print single level inheritance");
		childclass c= new childclass();
		c.play();
		c.school();
		

	} 
	}

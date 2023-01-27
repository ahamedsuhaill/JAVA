package chrome;

public class StudentInfo {
	public void Studentname() {
		System.out.println("Name:SUHAIL");
	}

	public void studentidno() {
		System.out.println("id no=912818105001");
	}

	public void StudentMark() {
		System.out.println("Mark:1005");
	}

	public void StudentAddress() {
		System.out.println("Address:RAMANATHAPURAM");
	}

	public static void main(String[] arg) {
		StudentInfo info = new StudentInfo();
		info.Studentname();
		info.StudentMark();
		info.studentidno();
		info.StudentAddress();
	}
}
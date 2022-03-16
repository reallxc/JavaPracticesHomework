package nz.ac.arastudent.xil0393;

public class Ex1 {
	public String checkMark ( int mark) {
		String result = "FAIL";
		if (mark >= 50) {
			result = "PASS";
		}
		return result;
	}
}

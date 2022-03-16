package nz.ac.arastudent.xil0393;

public class Ex2 {
	public String CheckNumber (int number) {
		String result = "";
		if ((number%2) == 0) {
			result = "Even Number";
		} else {
			result = "Odd Number";
		}
		return result;
		
	}
}

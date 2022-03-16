package nz.ac.arastudent.xil0393;

public class Ex3 {
	public String PrintWord(int number) {
		String result = "";
		switch (number) {
			case 1: result = "ONE";break;
			case 2: result = "TWO";break;
			case 3: result = "THREE";break;
			case 4: result = "FOUR";break;
			case 5: result = "FIVE";break;
			case 6: result = "SIX";break;
			case 7: result = "SEVEN";break;
			case 8: result = "EIGHT";break;
			case 9: result = "NINE";break;
			default: result = "OTHER";
		}
		return result;
	}
}

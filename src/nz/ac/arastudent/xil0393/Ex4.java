package nz.ac.arastudent.xil0393;

public class Ex4 {

	public String SumAndAverage() {
		int numberCount = 0;
		float tempSum = 0F;
		
		
//		for (int i=1;i<=100;i++) {
//			tempSum += i;
//			numberCount++;
//		}
		
//		int i = 1;
//		while(i<=100) {
//			tempSum += i;
//			numberCount++;
//			i++;
//		}
		
		int i = 1;
		do {
			tempSum += i;
			numberCount++;
			i++;
		} while (i<=100);
		
		float average = tempSum/numberCount;
		return "Total number:" + numberCount + "\nThe sum is " + tempSum + "\nThe average is " + average;
	}
	public String SumAndAverageMod7() {
		int numberCount = 0;
		float tempSum = 0F;
		
		for (int i=111;i<=8989;i++) {
			tempSum += i;
			numberCount++;
		}
		
		float average = tempSum/numberCount;
		return "Total number from 111 to 8989:" + numberCount + "\nThe sum is " + tempSum + "\nThe average is " + average;
	}
	public String SumAndAverageMod8() {
		int numberCount = 0;
		float tempSum = 0F;
		
		for (int i=1;i<=100;i++) {
			if (i%2!=0) {
				tempSum += i;
				numberCount++;
			}
		}
		
		float average = tempSum/numberCount;
		return "Total number odd only:" + numberCount + "\nThe sum is " + tempSum + "\nThe average is " + average;
	}
	public String SumAndAverageMod9() {
		int numberCount = 0;
		float tempSum = 0F;
		
		for (int i=1;i<=100;i++) {
			if (i%7==0) {
				tempSum += i;
				numberCount++;
			}
		}
		
		float average = tempSum/numberCount;
		return "Total number 7 divisible:" + numberCount + "\nThe sum is " + tempSum + "\nThe average is " + average;
	}
	public String SumAndAverageMod10() {
		int numberCount = 0;
		float tempSum = 0F;
		
		for (int i=1;i<=100;i++) {
			tempSum += i * i;
			numberCount++;
		}
		
		float average = tempSum/numberCount;
		return "Total number sum of squares:" + numberCount + "\nThe sum is " + tempSum + "\nThe average is " + average;
	}

}

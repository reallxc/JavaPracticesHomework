package nz.ac.arastudent.xil0393;


public class Ex14 {

	public void Fibonacci(int n) {
		int[] numbers = new int[n];
		int numberCount = 0;
		float tempSum = 0F,average = 0F;
		System.out.println("The first " + n + " Fibonacci numbers are:");
		for (int i=1;i<=n;i++) {
			if (i<=2) {
				numbers[i-1] = 1;
			}
			else {
				numbers[i-1] = numbers[i-2] + numbers[i-3];
			}
			tempSum += numbers[i-1];
			numberCount++;
			System.out.print(numbers[i-1] + " ");
		}
		System.out.println(" ");
		average = tempSum / numberCount;
		System.out.println("The average is " + average);
	}

}

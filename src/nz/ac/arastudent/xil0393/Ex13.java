package nz.ac.arastudent.xil0393;


public class Ex13 {

	public float ComputePI(int n) {
		float result = 0F;
		int tempNumber = 1;
		for (float i=1;i<=n;i=i+2) {
			result += 1/i*tempNumber;
			tempNumber *= -1;
		}
		
		result *= 4;
		return result;
	}
	public double GetPi() {
		return Math.PI;
	}

}

package nz.ac.arastudent.xil0393;

public class Ex12 {

	public float HarmonicSum(int n) {
		float result = 0F;
		for (float i=1;i<=n;i++) {
			result += 1/i;
			System.out.println("R:"+result+" I:"+i);
		}
		return result;
	}

}

package nz.ac.arastudent.xil0393;

public class Ex11 {

	public int Product1toN(int n) {
		int tempresult = 1;
		for (int i=1;i<=n;i++) {
			tempresult *= i;
		}
		return tempresult;
	}

}

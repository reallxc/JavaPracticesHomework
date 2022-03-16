package nz.ac.arastudent.xil0393;

public class Ex15Controller extends ExerciseController {
	Ex15 ex15 = new Ex15();
	public Ex15Controller(IView theView) {
		super(theView);
	}

	@Override
	protected void doStuff() {
		ex15.Tribonacci(Integer.parseInt(this.myView.get("[Ex15]Input N number:")));
	}

}

package nz.ac.arastudent.xil0393;

public class Ex14Controller extends ExerciseController {
	Ex14 ex14 = new Ex14();
	public Ex14Controller(IView theView) {
		super(theView);
	}

	@Override
	protected void doStuff() {
		ex14.Fibonacci(Integer.parseInt(this.myView.get("[Ex14]Input N number:")));
	}

}

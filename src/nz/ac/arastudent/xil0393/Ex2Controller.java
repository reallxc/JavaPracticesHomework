package nz.ac.arastudent.xil0393;

public class Ex2Controller extends ExerciseController {
	Ex2 ex2 = new Ex2();
	public Ex2Controller(IView theView) {
		super(theView);
	}

	@Override
	protected void doStuff() {
		int inputNumber = Integer.parseInt(myView.get("Input number:"));
		this.myView.say(inputNumber + " is a " + ex2.CheckNumber(inputNumber));
	}

}

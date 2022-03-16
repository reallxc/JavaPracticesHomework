package nz.ac.arastudent.xil0393;

public class Ex3Controller extends ExerciseController {
	Ex3 ex3 = new Ex3();
	public Ex3Controller(IView theView) {
		super(theView);
	}

	@Override
	protected void doStuff() {
		int inputNumber = Integer.parseInt(myView.get("Input number:"));
		this.myView.say(ex3.PrintWord(inputNumber));
	}

}

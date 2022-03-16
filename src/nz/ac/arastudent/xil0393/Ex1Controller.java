package nz.ac.arastudent.xil0393;

public class Ex1Controller extends ExerciseController {
	Ex1 ex1 = new Ex1();
	public Ex1Controller(IView theView) {
		super(theView);
	}

	@Override
	protected void doStuff() {
		int inputNumber = Integer.parseInt(myView.get("Input mark:"));
		this.myView.say("Mark " + inputNumber + " is "+ex1.checkMark(inputNumber));
	}

}

package nz.ac.arastudent.xil0393;

public class Ex12Controller extends ExerciseController {
	Ex12 ex12 = new Ex12();
	public Ex12Controller(IView theView) {
		super(theView);
	}

	@Override
	protected void doStuff() {
		this.myView.say(ex12.HarmonicSum(Integer.parseInt(this.myView.get("[Ex12]Input N number:"))));
	}

}
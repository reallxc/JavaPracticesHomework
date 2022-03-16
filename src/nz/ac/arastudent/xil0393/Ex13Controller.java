package nz.ac.arastudent.xil0393;

public class Ex13Controller extends ExerciseController {
	Ex13 ex13 = new Ex13();
	public Ex13Controller(IView theView) {
		super(theView);
	}

	@Override
	protected void doStuff() {
		this.myView.say(ex13.ComputePI(Integer.parseInt(this.myView.get("[Ex13]Input N number:"))));
		this.myView.say("PI is:" + ex13.GetPi());
	}

}

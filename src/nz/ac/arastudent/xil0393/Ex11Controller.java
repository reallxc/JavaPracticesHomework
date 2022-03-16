package nz.ac.arastudent.xil0393;

public class Ex11Controller extends ExerciseController {
	Ex11 ex11 = new Ex11();
	public Ex11Controller(IView theView) {
		super(theView);
	}

	@Override
	protected void doStuff() {
		this.myView.say(ex11.Product1toN(Integer.parseInt(this.myView.get("Input N number:"))));
	}

}

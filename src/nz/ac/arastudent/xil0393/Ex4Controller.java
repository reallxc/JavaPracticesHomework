package nz.ac.arastudent.xil0393;

public class Ex4Controller extends ExerciseController {
	Ex4 ex4 = new Ex4();
	public Ex4Controller(IView theView) {
		super(theView);
	}

	@Override
	protected void doStuff() {
		this.myView.say(ex4.SumAndAverage());
		this.myView.say(ex4.SumAndAverageMod7());
		this.myView.say(ex4.SumAndAverageMod8());
		this.myView.say(ex4.SumAndAverageMod9());
		this.myView.say(ex4.SumAndAverageMod10());
	}

}

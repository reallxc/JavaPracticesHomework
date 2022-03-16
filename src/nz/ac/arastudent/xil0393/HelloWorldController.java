package nz.ac.arastudent.xil0393;

public class HelloWorldController extends ExerciseController {
	HelloWorld hw1 = new HelloWorld();
	
	public HelloWorldController(IView theView) {
		super(theView);
	}
	
	@Override
	protected void doStuff() {
		String inputName = myView.get("What is your name?");
		this.myView.say(hw1.greet(inputName));

	}

}

package nz.ac.arastudent.xil0393;

public class Ex16Controller extends ExerciseController {
    Ex16 ex16 = new Ex16();
    public Ex16Controller(IView theView) {
        super(theView);
    }

    @Override
    protected void doStuff() {
        this.myView.say(ex16.ReverseString(this.myView.get("[Ex16] Input a string:")));
    }
}

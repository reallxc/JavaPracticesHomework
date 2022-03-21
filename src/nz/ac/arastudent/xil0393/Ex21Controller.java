package nz.ac.arastudent.xil0393;

public class Ex21Controller extends ExerciseController {
    private int[] intArray = {1,2,3,4,5,6};
    Ex21 ex21 = new Ex21(intArray);
    public Ex21Controller(IView theView) {
        super(theView);
    }

    @Override
    protected void doStuff() {
        Ex21.ReverseArrayTest(ex21);
        this.myView.say(ex21.intArray[0]);
    }
}

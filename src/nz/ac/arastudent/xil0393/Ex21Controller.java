package nz.ac.arastudent.xil0393;

public class Ex21Controller extends ExerciseController {
    public Ex21Controller(IView theView) {
        super(theView);
    }

    @Override
    protected void doStuff() {
        //SCOPE 1
        int[] a = new int[]{12,56,34,79,26};
        this.myView.say("Original:");
        this.outPutArray(a);
        //definition and initialization of an object
        Ex21 reArray = new Ex21(a);
        this.myView.say("Reversed:");
        this.outPutArray(a);
    }
    public void outPutArray(int[] array) {
        //SCOPE 2
        String output="{";
        for (int i:array
        ) {
            output = output + i + ",";
        }
        this.myView.say(output + "}");
    }
}

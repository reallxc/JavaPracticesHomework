package nz.ac.arastudent.xil0393;

public class Ex22Controller extends ExerciseController {
    Ex22 ex22 = new Ex22();
    public Ex22Controller(IView theView) {
        super(theView);
    }

    @Override
    protected void doStuff() {
        this.myView.say("Key in your guess:");
        int result,count = 0;
        do {
            result = ex22.NumberGuess(Integer.parseInt(this.myView.get()));
            count ++;
            if (result == -1) this.myView.say("Try higher");
            else if (result == 1) this.myView.say("Try lower");
        }
        while (result != 0);
        this.myView.say("You got it in " + count + " trials!");
    }
}

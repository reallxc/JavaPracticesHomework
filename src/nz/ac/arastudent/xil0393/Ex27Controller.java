package nz.ac.arastudent.xil0393;

public class Ex27Controller extends ExerciseController {
    public Ex27Controller(IView theView) {
        super(theView);
    }

    @Override
    protected void doStuff() {
        int upperBound = Integer.parseInt(this.myView.get("Enter the upper bound:"));
        int count = 0;
        for (int i=1;i<=upperBound;i++){
            if (Ex27.isProductOfPrimeFactors(i)){
                this.myView.say(i);
                count++;
            }
        }
        this.myView.say(count + " numbers found (" + String.format("%.2f",(float)count/(float)upperBound*100) + "%)");
    }
}

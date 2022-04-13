package nz.ac.arastudent.xil0393;

public class Ex26Controller extends ExerciseController {
    public Ex26Controller(IView theView) {
        super(theView);
    }

    @Override
    protected void doStuff() {
        int upperBound = Integer.parseInt(this.myView.get("Please enter the upper bound:"));
        int primeCount = 0;
        for (int i =1;i<=upperBound;i++){
            if (Ex26.isPrime(i)) {
                this.myView.say(i);
                primeCount++;
            }
        }
        this.myView.say(primeCount + " primes found (" + String.format("%.2f",(float)primeCount/(float)upperBound*100) + "%)");
    }
}

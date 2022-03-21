package nz.ac.arastudent.xil0393;
public class Ex17Controller extends ExerciseController {
    Ex17 ex17 = new Ex17();
    public Ex17Controller(IView theView) {
        super(theView);
    }

    @Override
    protected void doStuff() {
        String input = this.myView.get("Input a string:").toLowerCase();
        for (char ch : input.toCharArray()){
            this.myView.say(ex17.PhoneKeyPad(String.valueOf(ch)));
        }
    }
}
package nz.ac.arastudent.xil0393;

public class Ex18Controller extends ExerciseController {
    Ex18 ex18 = new Ex18();
    public Ex18Controller(IView theView) {
        super(theView);
    }

    @Override
    protected void doStuff() {
        String input = this.myView.get("Input a string:");
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]","");
        //myView.say("Cleaned input:"+cleanInput);
        if (ex18.Palindrome(cleanInput.toLowerCase().toCharArray())) this.myView.say("\"" + input + "\" is a palindrome.");
        else this.myView.say("\"" + input + "\" is not a palindrome.");
    }
}

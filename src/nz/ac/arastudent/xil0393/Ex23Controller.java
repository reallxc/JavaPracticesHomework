package nz.ac.arastudent.xil0393;

public class Ex23Controller extends ExerciseController {
    Ex23 ex23 = new Ex23();
    public Ex23Controller(IView theView) {
        super(theView);
    }

    @Override
    protected void doStuff() {
        boolean result = false;
        String guessInput;
        int count = 0;
        do {
            if (count!=0){
                this.myView.add("Trail "+count+": ");
                for (char ch: ex23.outputChar) {
                    this.myView.add(ch);
                }
                this.myView.add(" ");
            }
            guessInput = this.myView.get("Key in one character or your guess word:");
            if (guessInput.length()>1){
                result = ex23.WordGuessStrict(guessInput.toCharArray());
            }
            else {
                result = ex23.WordGuess(guessInput.toCharArray()[0]);
            }
            count ++;
        } while (result==false);
        this.myView.say("Trail " + count + ": Congratulation!");
        this.myView.say("You got in " + count + " trails");
    }
}

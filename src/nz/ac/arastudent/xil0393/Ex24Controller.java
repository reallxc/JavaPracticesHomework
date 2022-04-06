package nz.ac.arastudent.xil0393;

public class Ex24Controller extends ExerciseController {
    Ex24 ex24 = new Ex24();
    public Ex24Controller(IView theView) {
        super(theView);
    }

    @Override
    protected void doStuff() {
        this.myView.say(ex24.DayOfWeek(this.myView.get("Input a date(DD-MM-YYYY, Year after 1583):")));
    }
}

package nz.ac.arastudent.xil0393;

import java.sql.Array;

public class Ex19Controller extends ExerciseController {
    Ex19 ex19 = new Ex19();
    public Ex19Controller(IView theView) {
        super(theView);
    }

    @Override
    protected void doStuff() {
        int numberOfGrades = Integer.parseInt(this.myView.get("Enter the number of students:"));
        int[] grades = new int[numberOfGrades];
        for (int i=0;i<numberOfGrades;i++){
            do {
                grades[i]=Integer.parseInt(this.myView.get("Enter the grade for student " + (i+1) +":"));
                if (!(grades[i]>=0 && grades[i]<=100)) this.myView.say("Invalid grade, try again...");
            }
            while (!(grades[i]>=0 && grades[i]<=100));
        }
        this.myView.say("The average is " + ex19.GradesAverage(grades));
        this.myView.say("The minimum is " + ex19.GradesMin(grades));
        this.myView.say("The maximum is " + ex19.GradesMax(grades));
        this.myView.say("The average is " + ex19.GradesStandardDeviation(grades));
    }
}

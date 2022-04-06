package nz.ac.arastudent.xil0393;

import java.util.ArrayList;

public class Ex25Controller extends ExerciseController {
    public Ex25Controller(IView theView) {
        super(theView);
    }

    @Override
    protected void doStuff() {
        PerfectNumberList(Integer.parseInt(this.myView.get("Enter the upper bound:")));
    }

    public void PerfectNumberList(int limitation){
        ArrayList<Integer> perfectNumbers = new ArrayList<>();
        ArrayList<Integer> otherNumbers = new ArrayList<>();
        for (int i=1;i<=limitation;i++){
            if (Ex25.isPerfect(i)) perfectNumbers.add(i);
            else if (!Ex25.isDeficient(i)) otherNumbers.add(i);
        }
        double limit = limitation,sizeP = perfectNumbers.size(),sizeO = otherNumbers.size();
        this.myView.say("The numbers are perfect:");
        this.myView.say(perfectNumbers);
        this.myView.say("[" + perfectNumbers.size() + " perfect numbers found (" + sizeP*100/limit + "%)]");

        this.myView.say("The numbers are neither deficient nor perfect:");
        this.myView.say(otherNumbers);
        this.myView.say("[" + otherNumbers.size() + " numbers found (" + sizeO*100/limit + "%)]");

    }
}

package nz.ac.arastudent.xil0393;

public class Ex22 {
    private int targetNumber;
    public  Ex22(){
        this.targetNumber = (int)(Math.random() * 100);
    }

    /**
     *
     * @param guessNumber input by user to guess target number
     * @return
     * -1 : lower
     * 0 : equal
     * 1 : higher
     */
    public int NumberGuess(int guessNumber) {
        if (guessNumber==this.targetNumber) return 0;
        else if (guessNumber>this.targetNumber) return 1;
        else return -1;
    }
}

package nz.ac.arastudent.xil0393;

public class Ex18 {
    public boolean Palindrome(char[] inputChar){
        boolean result = true;
        int length = inputChar.length;
        for (int i = 0;i<length/2;i++){
            //System.out.println("Comparing " + inputChar[i] + " and " + inputChar[length-1-i]);
            if (inputChar[i]!=inputChar[length-1-i]) result = false;
        }
        return result;
    }
}

package nz.ac.arastudent.xil0393;

public class Ex17 {
    public String PhoneKeyPad(String inChar){
        String result = "0";
        String[] mapping = new String[] {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for (int i=0;i<8;i++){
            if (mapping[i].contains(inChar)){
                result = Integer.toString(i+2);
            }
        }
        return result;
    }
}

package nz.ac.arastudent.xil0393;

public class Ex21 {
    public int[] intArray;

    public Ex21(int[] intArray) {
        this.intArray = intArray;
    }
    public static void ReverseArrayTest(Ex21 exInstance){
        exInstance.intArray = exInstance.reverseArray(exInstance.intArray);
    }
    private int[] reverseArray(int[] intArray){
        int temp;
        for (int i=0;i< intArray.length;i++){
            System.out.println("Old:"+intArray[i]);
            temp = intArray[i];
            intArray[i]= intArray[intArray.length-1-i];
            intArray[intArray.length-1-i] = temp;
            System.out.println("New:"+intArray[i]);
        }
        return intArray;
    }
}

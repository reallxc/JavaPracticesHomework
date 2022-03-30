package nz.ac.arastudent.xil0393;

public class Ex21 {
    public Ex21(int[] intArray) {
        //class with a constructor
        this.reverse(intArray);
    }
    public void reverse(int[] intArray){
        //SCOPE3
        int temp;
        for (int i=0;i< intArray.length/2;i++){
            temp = intArray[i];
            intArray[i]= intArray[intArray.length-1-i];
            intArray[intArray.length-1-i] = temp;
        }
    }
}

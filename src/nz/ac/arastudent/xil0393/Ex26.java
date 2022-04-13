package nz.ac.arastudent.xil0393;

public class Ex26 {
    public static boolean isPrime(int posInt){
        for (int i=2;i<posInt;i++) if (posInt%i==0) return false;
        return true;
    }
}

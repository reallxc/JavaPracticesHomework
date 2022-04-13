package nz.ac.arastudent.xil0393;

public class Ex27 {
    public static boolean isProductOfPrimeFactors(int posInt){
        int tempProduct = 1;
        for (int i=2;i<posInt;i++){
            if (Ex26.isPrime(i)){
                if (posInt%i==0){
                    tempProduct *= i;
                }
            }
        }
        return tempProduct==posInt;
    }
}

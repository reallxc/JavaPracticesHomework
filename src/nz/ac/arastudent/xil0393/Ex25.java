package nz.ac.arastudent.xil0393;

//Perfect integer: self = sum(proper divisors)
//Deficient integer: self > sum(proper divisors)

import java.util.ArrayList;

public class Ex25 {
    private static int sumOfProperDivisors(int num){
        int tempSum = 0;
        for (int i=1;i<=num/2;i++){
            if (num % i == 0) {
                tempSum += i;
            }
        }
        return tempSum;
    }

    public static boolean isPerfect(int num){
        if (num == sumOfProperDivisors(num)) return true;
        else return false;
    }

    public static boolean isDeficient(int num){
        if (num > sumOfProperDivisors(num)) return true;
        else return false;
    }
}

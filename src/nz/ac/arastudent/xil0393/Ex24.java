package nz.ac.arastudent.xil0393;

import java.util.HashMap;
import java.util.Map;

public class Ex24 {
    private int[] monthsNumber = {1,4,4,0,2,5,0,3,6,1,4,6};
    private Map<Integer,Integer> centuryOffset = new HashMap<>(){{
        put(18,2);
        put(19,0);
        put(20,6);
        put(21,4);
    }};
    private final String[] WeekDays = {"Sat","Sun","Mon","Tues","Wed","Thurs","Fri"};
    public String DayOfWeek(String inputDate){
        String dateString[] = inputDate.split("-");
        //Should add input validations
        int dateNumbers[] = new int[3];
        for (int i=0;i<3;i++){
            dateNumbers[i] = Integer.parseInt(dateString[i]);
        }
        //Step 1, take last two digit of the year, and add a quarter of it
        int tempNum = dateNumbers[2] % 100 + dateNumbers[2] % 100/4;
        //Step 2, add value according to month
        tempNum = tempNum + monthsNumber[dateNumbers[1]-1];
        //Step 3, add day
        tempNum = tempNum + dateNumbers[0];
        //Step 4, add century offset
        int centuryOffsetPart = dateNumbers[2]/100;
        while (centuryOffsetPart<18||centuryOffsetPart>21){
            if (centuryOffsetPart<18) centuryOffsetPart = centuryOffsetPart + 4;
            else centuryOffsetPart = centuryOffsetPart + 4;
        }
        tempNum = tempNum + centuryOffset.get(centuryOffsetPart);
        //Step 5, leap year
        if ((dateNumbers[2]%4==0&&dateNumbers[2]%100!=0)||dateNumbers[2]%400==0){
            if (dateNumbers[1]==1||dateNumbers[1]==2){
                tempNum = tempNum - 1;
            }
        }
        //Final step, modulus 7
        return WeekDays[tempNum % 7];
    }
}

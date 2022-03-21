package nz.ac.arastudent.xil0393;
//Ex19-20
public class Ex19 {
    public float GradesAverage(int[] grades){
        float result = 0F;
        float sumOfGrades = 0F;
        for (int grade:grades) {
            sumOfGrades += grade;
        }
        result = sumOfGrades/grades.length;
        return result;
    }
    public int GradesMax(int[] grades){
        int result = 0;
        for (int grade:grades) {
            if (result<grade) result = grade;
        }
        return result;
    }
    public int GradesMin(int[] grades){
        int result = grades[0];
        for (int grade:grades) {
            if (result>grade) result = grade;
        }
        return result;
    }
    public float GradesStandardDeviation(int[] grades){
        float mean = GradesAverage(grades);
        float result = 0F;
        for (int i=0;i< grades.length;i++){
            result += (grades[i]-mean)*(grades[i]-mean);
        }
        result = (float) Math.sqrt(result/grades.length);
        return result;
    }
}

package Section6;

public class SumOddRange {
    public static void main(String[] args){
        System.out.println(sumOdd(100,1000));
    }
    public static boolean isOdd(int number){
        boolean toReturn=false;
        if(number>0){
            if(number%2!=0){
                toReturn=true;
            }
        }
        return toReturn;
    }
    public static int sumOdd(int start,int end){
        int sum=0;
        if((start>0) && (end>0) && (end>=start)) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum = sum + i;
                }
            }
        }else{
            sum=-1;
        }
        return sum;
    }
}

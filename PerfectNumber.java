package Section6;

public class PerfectNumber {
    public static void main(String[] args){
        System.out.println(isPerfectNumber(-1));
    }
    public static boolean isPerfectNumber(int number){
        int sumOfDividers=0;
        if(number>=1){
            for(int i=1;i<number;i++){
                if(number%i==0){
                    sumOfDividers=sumOfDividers+i;
                }
            }
            if(number==sumOfDividers){
               return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}

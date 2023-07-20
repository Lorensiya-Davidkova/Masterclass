package Section6;

public class TheWhileLoopChallange {
    public static void main(String[] args){
        int number=5;
        int evenCount=0;
        int oddCount=0;
        while(number<=20){
            if(isEven(number)){
               // System.out.println(number);
                evenCount++;
            }else{
                //System.out.println(number);
                oddCount++;
            }
            if(evenCount==5){
               // break;
            }
            number++;
        }
        System.out.println("Even Numbers Count-> "+evenCount);
        System.out.println("Odd Numbers Count -> "+oddCount);
    }
    public static boolean isEven(int number){
        boolean toReturn=false;
        if(number%2==0){
            toReturn=true;
        }
        return toReturn;
    }
}

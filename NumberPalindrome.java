package Section6;

public class NumberPalindrome {
    public static void main(String[] args){
       System.out.println(isPalindrome(11212));
    }
    public static boolean isPalindrome(int number){
        boolean toReturn=true;
        int number1=number;
        int countDigits=0;
        int numberAfter=0;
        int numberBefore=0;
        while(number>0){
            countDigits++;
            number=number/10;
        }
        int end=countDigits/2;
        for(int i=1;i<=end;i++){
            numberBefore=number1/(int)Math.pow(10,countDigits-1);
            if(numberBefore>9){
                numberBefore=numberBefore%10;
            }
            numberAfter=(number1%(int)Math.pow(10,i))/(int)Math.pow(10,i-1);
            countDigits--;
            if(numberBefore!=numberAfter){
                toReturn=false;
                break;
            }
        }
        return toReturn;
    }
}

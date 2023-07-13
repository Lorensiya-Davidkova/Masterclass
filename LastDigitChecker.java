package Section6;

public class LastDigitChecker {
    public static void main(String[] args){
        System.out.println(hasSameLastDigit(23,32,42));
    }
    public static boolean hasSameLastDigit(int x,int y, int z){
        boolean toReturn=false;
        if((isValid(x)) && (isValid(y)) && (isValid(z))){
            int x1=x%10;
            int y1=y%10;
            int z1=z%10;
            if((x1==y1) || (x1==z1) || (y1==z1)){
                toReturn=true;
            }
        }
        return toReturn;
    }
    public static boolean isValid(int number){
        if(number>=10 && number<=1000){
            return true;
        }else{
            return false;
        }
    }
}

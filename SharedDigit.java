package Section6;

public class SharedDigit {
    public static void main(String[] args){
        System.out.println(hasSharedDigit(15,55));
    }
    public static boolean hasSharedDigit(int x,int y){
        boolean toReturn=false;
        if((x>=10 && x<=99) && (y>=10 && y<=99)){
            int xFirstDigit=x/10;
            int xLastDigit=x%10;
            int yFirstDigit=y/10;
            int yLastDigit=y%10;
            if((xFirstDigit==yFirstDigit)||(xFirstDigit==yLastDigit) || (xLastDigit==yFirstDigit)|| (xLastDigit==yLastDigit)){
                toReturn=true;
            }
        }
        return toReturn;
    }
}

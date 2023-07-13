package Section6;

import java.util.ArrayList;

public class LargestPrime {
    public static void main(String[] args){
      System.out.println(getLargestPrime(-1));
    }
    public static int getLargestPrime(int number){
        int toReturn=0;
        if(number<=0){
            toReturn=-1;
        }else{
            ArrayList<Integer> primes=new ArrayList<>();
            int num1=number;
            for(int i=2;i<=num1;i++){
                if(number%i==0){
                    //System.out.println("1) Number "+number+" Delitel "+i);
                    primes.add(i);
                    number=number/i;
                    //System.out.println("2)Number "+number+" Delitel "+i);
                    i=1;
                }
            }
            toReturn=primes.get(primes.size()-1);
        }
        return toReturn;
    }
}

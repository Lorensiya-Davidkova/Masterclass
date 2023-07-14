package Section6;

import java.util.concurrent.CountDownLatch;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(0);
  }
  public static int getDigitCount(int number){
        int toReturn=0;
        if(number<0){
            toReturn=-1;
        }else if(number==0) {
            toReturn=1;
        }else{
            while(number>0){
                toReturn=toReturn+1;
                number=number/10;
            }
        }
        return toReturn;
  }
  public static int reverse(int number){
      int digits=getDigitCount(number);
      int flag1=0;
      int newNumber=0;
      if(digits==-1){
          number=number*(-1);
          digits=getDigitCount(number);
          flag1=1;
      }
      while(number>0){
          newNumber=newNumber+((number%10) * (int)Math.pow(10,digits-1));
          number=number/10;
          digits--;
      }
      if(flag1==1){
          newNumber=newNumber*(-1);
      }
      return newNumber;
  }
  // 100 => 001(realno 1) => 2 broq 0 otpred
    // 1010=> 0101(realno 101) => 1 broi nula
    // 100090=> 090001 (realno 90001) => 1 broi nula
    // razlikata ot broq cifri v reverstnoto chislo i broq cifri v poluchenoto ni pokazva kolko puti da pishe zero
    public static void numberToWords(int number){
        //176 One Seven Six ,no SIx Seven One
        // 176 -> reverse(176)-> 671 => One Seven Six
        //100610 => 16001
        String result="";
        int reversed=reverse(number);

        int additionalZero=getDigitCount(number)-getDigitCount(reversed);
        if(reversed<0){
            System.out.println("Invalid Value");
        }else if(reversed==0) {
            System.out.println("Zero");
        }else{
            while(reversed>0){
                int digit=reversed%10;
                switch(digit){
                    case 0:
                        result=result+(" Zero");
                        break;
                    case 1:
                        result=result+(" One");
                        break;
                    case 2:
                        result=result+(" Two");
                        break;
                    case 3:
                        result=result+(" Three");
                        break;
                    case 4:
                        result=result+(" Four");
                        break;
                    case 5:
                        result=result+(" Five");
                        break;
                    case 6:
                        result=result+(" Six");
                        break;
                    case 7:
                        result=result+(" Seven");
                        break;
                    case 8:
                        result=result+(" Eight");
                        break;
                    case 9:
                        result=result+(" Nine");
                        break;
                }
                reversed=reversed/10;
            }
            for(int i=0;i<additionalZero;i++){
                result=result+(" Zero");
            }

           System.out.println(result.substring(1));
        }
    }
}

package Section6;

import java.util.Scanner;

public class ReadingInputUserChallenge {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        for(int i=1;i<=5;i++){
            System.out.println("Enter number#"+i+": ");
            int number=0;
            try {
                number = Integer.parseInt(scanner.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Invalid number!");
                i=i-1;
            };
            sum=sum+number;
        }
        System.out.println("Sum:"+sum);
    }
}

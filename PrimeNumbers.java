package Section6;

import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) {
        // prime number-> число, което се дели САМО на себе си и на 1
        // I вариант
        int counter = 0;
        int counterPrimeNumbers=0;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.println(i + " -> Prime number");
                counterPrimeNumbers++;
            }
            counter = 0;
            if(counterPrimeNumbers==3){
                break;
            }
        }

        // II вариант
        /*ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    numbers.add(j);
                }
            }
            if (numbers.size() == 2 && numbers.contains(1) && numbers.contains(i)) {
                System.out.println(i + "-> Prime number!");
            }
            numbers = new ArrayList<>();
        }*/
    }
}

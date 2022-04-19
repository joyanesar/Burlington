package DailyPracticeJavaTaks;

import java.util.Scanner;
/*

 */
public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        boolean isPrime = true;

        for(int i = 2 ; i <= number; i++){

            if(i % number ==0){
                isPrime = false;
                break;
            }
        }

//        String result = "";
//        for(int i = 1; i <= number; i++){
//
//            if(i % 2 == 0){
//                result = "prime";
//            }else {
//                result = "Not prime";
//            }
//        }

        System.out.println("Is this  prime number : " + isPrime);

    }
}

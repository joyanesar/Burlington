package DailyPracticeJavaTaks;

public class ReversNumber {
    public static void main(String[] args) {
        /*
        Write a method that revers numbers
        Reverse a number using while loop
             */
        int num = 12345 , remainder, rev = 0;

        while (num != 0){
           
            remainder = num % 10;
           rev = rev * 10 + remainder;
           num = num / 10;
        }
        System.out.println("The reverse result is = " + rev);
    }
}

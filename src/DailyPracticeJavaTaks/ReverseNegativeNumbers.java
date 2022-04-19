package DailyPracticeJavaTaks;

public class ReverseNegativeNumbers {

            /*
        1.Number -- Reverse negative number
        Write a return method that can reverse
        negative number and return it as int.
         */

        public static int reverserNegativeNumbers(int num){

        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10; // 5
            num  = num / 10;
        }
        return reverse;


    }

    public static void main(String[] args) {
        System.out.println(reverserNegativeNumbers(-12345));
        System.out.println(reverserNegativeNumbers(2548));
    }
}
package DailyPracticeJavaTaks;

public class OddOrEven {
    //public static void main(String[] args) {
        /*
        2.Numbers -- odd & even
        Write  a method which can identifies given number is even or odd
         */


    public static void oddEven(int number){

                if( number % 2==0){
                System.out.println( number + " even");
            }else {
                System.out.println(number + " odd");
            }

        }
    public static void main(String[] args) {
        oddEven(8);
        oddEven(91);
    }

}


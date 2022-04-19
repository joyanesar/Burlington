package DailyPracticeJavaTaks;

public class ReverseSentence {

    public static void main(String[] args) {

        /*
        Write a method that reverse sentence
        String sentence = "Today is great day";
        yad taerg si yadoT

         */
        String str = "Today is great day";
        String [] arr = str.split("");
        String revs = "";
        for(int i = arr.length -1; i >=0; i--){

            revs +=arr[i];
        }


        System.out.println(revs);
    }
}

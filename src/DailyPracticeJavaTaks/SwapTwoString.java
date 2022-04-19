package DailyPracticeJavaTaks;

public class SwapTwoString {
    public static void main(String[] args) {
        //Write a method swap two String


        String a = "java";
        String b = "python";


        a = a + b;

        b = a.substring(0,(a.length() - b.length()));

        a = a.substring(b.length());

        System.out.println(a);
        System.out.println(b);



    }

}

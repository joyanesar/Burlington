package DailyPracticeJavaTaks;

public class ReverseWord {
    /*
    write a method that reverse word;
    input = "java"
        output = "avaj"
     */
    public static void main(String[] args) {
        String str = "java";
        String rvs = "";

        for(int i = str.length() -1; i >=0; i--){
            rvs += str.charAt(i);
        }
        System.out.println("Java reversed to = " + rvs );
     }

    }




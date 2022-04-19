package DailyPracticeJavaTaks;

public class uniqueChars {
    public static void main(String[] args) {

       String st = "abcdabcabc";
       String unique = "";

       for(int i = 0; i < st.length(); i++){

           if(!unique.contains("" + st.charAt(i))){

               unique += st.charAt(i);
           }
       }
        System.out.println(unique);
    }
}
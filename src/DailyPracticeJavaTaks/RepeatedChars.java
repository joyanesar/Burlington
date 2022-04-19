package DailyPracticeJavaTaks;

public class RepeatedChars {

    public static void main(String[] args) {

        String st = "ahmad";

        for(int i = 0; i <st.length(); i++){
            for(int j = i + 1; j <st.length(); j++){

                if(st.charAt(i)== st.charAt(j)){

                    System.out.println(st.charAt(i) + " is repeated chars");
                }
            }
        }




    }

}

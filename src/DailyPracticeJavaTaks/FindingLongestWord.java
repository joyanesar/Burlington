package DailyPracticeJavaTaks;

public class FindingLongestWord {
    public static void main(String[] args) {
        /*
        write a method to find longest/shortest word in a String array
        String str = ("apple", "banana", "pie", "pineapple", "apricots");
         */
        //First approach
//
//        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "pie", "pineapple", "waterMillion"));
//
//        String longestFruit = "";
//
//
//        for (String eachFruit : fruits) {
//            if (eachFruit.length() > longestFruit.length()) {
//                longestFruit = eachFruit;
//
//            }
//        }
//
//        String shortestFruit = longestFruit;
//        for(String eachF : fruits){
//            if(eachF.length() < shortestFruit.length()){
//                shortestFruit = eachF;
//            }
//        }
//
//        System.out.println("Shortest fruit is = " + shortestFruit);
//        System.out.println("Longest fruit is = " + longestFruit);
//    }
//}
//

        //finding longest word in String array
        String[] str = {"apple", "banana", "plane", "softskill", "selenium"};
        String longest = "";

        for(int i = 0; i < str.length; i++){

            if(str[i].length() > longest.length()){
                longest = str[i];
            }
        }
        System.out.println(longest);

    }
}








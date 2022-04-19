package DailyPracticeJavaTaks;

public class FindingShortestWord {
    public static void main(String[] args) {
        String sentence = "my favorite subject is java!";
        String[] arr = sentence.split(" ");
        int count =0;
        String longestWord = arr[0];
        String shortestWord = arr[0];
        for(int i =0; i < arr.length; i++){
            if(arr[i].length() > longestWord.length()){
                longestWord = arr[i];
            }
            if(arr[i].length() < shortestWord.length()){
                shortestWord = arr[i];
            }


        }
        System.out.println(count);
        System.out.println("The longest word is = " + longestWord);
        System.out.println("The shortest word is = " + shortestWord);
    }
}

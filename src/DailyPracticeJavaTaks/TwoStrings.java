package DailyPracticeJavaTaks;

import java.util.Scanner;

public class TwoStrings {


    //Create the method to accept two String and return true false

//    public static boolean twoString(String st, String str){
//
//        if(st.contains(str)){
//
//            return true;
//        }else {
//            return false;
//        }
//
//    }

    public static void main(String[] args) {
//        System.out.println(twoString("Nadir","Nad"));

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int number= in.nextInt();

        int palindrome = 0;

      for(int i = number -1; i>=0; i--){

          palindrome += number;
      }
        if(palindrome == number){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }


    }

}

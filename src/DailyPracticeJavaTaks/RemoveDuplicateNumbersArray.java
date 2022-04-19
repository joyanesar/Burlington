package DailyPracticeJavaTaks;

public class RemoveDuplicateNumbersArray {
    public static void main(String[] args) {


        int[] num = {1, 2, 5, 4, 5, 6, 5, 7, 5};


          for(int i = 0; i <num.length -1; i++){
              for (int j =  i + 1 ; j < num.length; j++){

                  if(num[i] == num[j] && (i != j)){
                      System.out.println(num[i]);
                  }
              }

        }


    }


}

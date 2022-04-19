package DailyPracticeJavaTaks;

public class RevWord {
    //How to find out if the number is Armstrong or not
      public static boolean isArmstrongNum(int n){
          int temp = n, r, sum =0;
          while (n >0){
              r = n % 10 ;
              n = n /10;
              sum = sum + r * r *r;
          }
          if(temp == sum){
              return true;
          }else {
              return false;
          }
      }

    public static void main(String[] args) {
        System.out.println(isArmstrongNum(153));
        System.out.println(isArmstrongNum(155));
    }
}

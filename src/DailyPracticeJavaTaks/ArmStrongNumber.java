package DailyPracticeJavaTaks;

public class ArmStrongNumber {
    /*
     Armstrong numbers
Write a method that can check if a number is Armstrong  number.
     */
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int origN = input.nextInt();       // the cub of every digit .
//         //int origN = 153;               //153 == 1*1*1 + 5 * 5 * 5 + 3 * 3 * 3 = 153
//       int temp = origN; // we do nt to lose the original value
//       int r ;
//       int cube = 0;                        // 370 =  3 * 3 *3 + 7 * 7 * 7 + 0 * 0 * 0 =
//                                                // 27 +          343 + = 370
//       while (origN > 0 ) {
//
//           r = origN % 10;  // remainder = 3 / r =3
//
//           origN = origN / 10;  // n is 15  stored in n variable
//
//           cube = cube +  r * r * r;
//
//
//       }
//        if(temp ==cube){
//            System.out.println("Its an AmStrong number");
//        }else {
//            System.out.println("Its not AmStrong number");
//        }
//

        int num = 375;  // 1*1*1* + 5*5*5 + 3*3*3 = 1+125+27 =153
                            // 3*3*3 + 7*7*7 + 1   =27+343+1 =371
                           // 370   = 27 + 243 +0 =370
                           // 27 + 243 + 125 =395
        int temp =num;
        int r ;
        int result = 0;

        while (num > 0){
            r = num % 10 ; //3
            num = num / 10 ; //15

            result = result + r * r * r ;

        }
        if(temp == result){
            System.out.println("its an armstrong number");
        }else {
            System.out.println("its not armstrong number");
        }
    }

}

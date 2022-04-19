package DailyPracticeJavaTaks;

public class FindFin_RA {


//      String result = "";
//
//        for(int i = 1 ; i <= 30; i++){
//            if( i % 3 ==0 && i % 5 == 0){
//                result = "FINRA";
//            }else if (i % 3 ==0){
//
//                result = "FIN";
//            }else if( i % 5 == 0){
//                result = "RA";
//
//            }else {
//                result = i + " ";
//            }
//        }
//        System.out.println(result);
public static void main(String[] args) {
        System.out.println(findFINRA(15));
        System.out.println(findFINRA(13));
        System.out.println(findFINRA(25));
        System.out.println(findFINRA(9));
    System.out.println(findFINRA(30));
    }
    public static String findFINRA(int num){
        String result = "";

        for(int i = 1 ; i <= num; i++){

            if(i % 3 ==0 && i % 5 ==0){
                result  = "FINRA";
            }else if( i % 3 ==0){
                result = "FIN";

            }else if(i % 5 ==0){
                result = "RA";
            }else {
                result = i + " ";
            }
        }
        return result;
    }
}

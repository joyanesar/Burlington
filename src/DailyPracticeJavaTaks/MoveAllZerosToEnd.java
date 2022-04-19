package DailyPracticeJavaTaks;
import java.util.Arrays;
public class MoveAllZerosToEnd {
            /*
        DailyPracticeJavaTaks.Array -- Move zeros to the end
- Write a method that can move all the zeros to
last indexes of the array (Do Not Use Sort Method)
         */
//        int[] arr = {0,1,0,4,0,3,0,2};
//            // need to declare new array
//        int[] newArray = new int[arr.length];
//
//        int counter =0;
//
//        for(int each: arr){
//            if(each >0){      //if(each !=0) two ways we can do
//                newArray[counter++] = each;
//            }
//        }
//        System.out.println(Arrays.toString(newArray));

    public static int[] shiftAllZerosToEnd(int[] number){

        int[] newArray = new int[number.length];
        int counter =0;

        for(int each : number){

            if(each > 0){   //if(each !=0)
                newArray[counter++] = each;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int [] arr = {0,2,0,3,0,5,0,9};
        int [] str = {0,6,7,4,6,2,0,3};
        System.out.println(Arrays.toString(shiftAllZerosToEnd(arr)));
        System.out.println(Arrays.toString(shiftAllZerosToEnd(str)));
    }
}

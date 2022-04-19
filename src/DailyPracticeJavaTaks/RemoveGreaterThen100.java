package DailyPracticeJavaTaks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveGreaterThen100 {
    /*
    and 3.ArrayList -- Remove some values
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc.
   remove all values greater than 100.
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 85, 100, 35, 66, 150, 7, 99, 120, 10));

        System.out.println("Old List " + list);

        list.removeIf(newList -> newList >= (100));
        {
            list.remove(list);

        }
        System.out.println("Current List " + list);
    }
}










//        public static void main (String[]args){
//            ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 140, 100, 102,6, 8, 88,101,103, 99, 100, 120));
//
//            System.out.println("Before loop " + numbers);
//            ArrayList<Integer>num = new ArrayList<>();
//
//            for (int i = 1; i <numbers.size(); i++) {
//                if (numbers.get(i) > 100) {
//                     num.add(i);
//                    num.remove(i);
//
//
//
//                }
//            }

      //      System.out.println("New list " + num);
//
//
//        }
//
//    }
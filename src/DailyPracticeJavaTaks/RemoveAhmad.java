package DailyPracticeJavaTaks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAhmad {
    /*
    2.ArrayList -- Remove "Ahmed"
given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed.
     */

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed","John","Eric","Ahmed","Nadir","Ahmed","Anna","Sam","Ahmed"));
        System.out.println(names);

//        for(Iterator<String> iterator = list.iterator();iterator.hasNext(){
//            String newList = iterator.next();
//            if(newList.contains("Ahmed")){    // First approach
//                iterator.remove();
//            }
//
//        }
       for(int i = 0; i < names.size(); i++){    // Second approach

           if(names.contains("Ahmed")){
               names.remove("Ahmed");
           }


        }
        //names.removeIf(newList -> newList.contains("Ahmed")); // Third approach
        System.out.println(names);
    }

}

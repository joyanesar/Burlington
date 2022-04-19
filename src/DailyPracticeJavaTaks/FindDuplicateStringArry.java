package DailyPracticeJavaTaks;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateStringArry {

    public static void main(String[] args) {

        String [] names = {"ahmad","usman","ahmad","ali"};

//
//        for(int i = 0; i <name.length; i++){
//            for(int j = i+1; j <name.length; j++){
//
//                if(name[i].equalsIgnoreCase(name[j])){
//                    System.out.println("Duplicate name " + name[i]);
//                }
//            }
//        }

              //second approach

        Set<String> list = new HashSet<>();
        for(String name : names){
            if(list.add(name) == false){
                System.out.println("duplicate " + name);
            }
        }


    }


}

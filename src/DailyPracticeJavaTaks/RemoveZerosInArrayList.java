package DailyPracticeJavaTaks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveZerosInArrayList {
    public static void main(String[] args) {
            //remove zeros in Arraylist
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,4,0,5,0,7,0,3));
        ArrayList<Integer>newList = new ArrayList<>();
        for(int each: list){
            if(each > 0){
                newList.add(each);
            }
        }
        System.out.println(newList);

            }
        }

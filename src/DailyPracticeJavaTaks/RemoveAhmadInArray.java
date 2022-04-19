package DailyPracticeJavaTaks;

import java.util.Arrays;
import java.util.List;

public class RemoveAhmadInArray {
    public static void main(String[] args) {

        String[] names = {"ali", "sam", "Ahmad", "mike", "Ahmad"};


        //convert to arraylist

        List<String> newNames = Arrays.asList(names);

                for(String name : newNames){

                    if(!name.equals("ahmad")){
                        System.out.println(name);

                }
            }




        }
    }


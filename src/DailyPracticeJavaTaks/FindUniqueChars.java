package DailyPracticeJavaTaks;

import java.util.Arrays;
import java.util.Collections;

public class FindUniqueChars {
    public static void main(String[] args) {

        String str = "java";

        String result = "";

        for(String each: str.split("")){
            result +=(  (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";


        }
        System.out.println(result);
    }
}

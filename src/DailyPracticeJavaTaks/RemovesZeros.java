package DailyPracticeJavaTaks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovesZeros {

    public static void main(String[] args) {
        ArrayList<Integer>num = new ArrayList<>(Arrays.asList(1,0,3,0,4,0,6,0,5,0));

        for(int i = 0; i < num.size(); i++){
            if(num.get(i) == 0){
                num.remove(i--);
            }
        }
        System.out.println(num);
    }


}

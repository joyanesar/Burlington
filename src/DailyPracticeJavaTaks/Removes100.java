package DailyPracticeJavaTaks;

import java.util.ArrayList;
import java.util.Arrays;

public class Removes100 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter some numbers");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,101,2,100,103,99,10));
        //numbers.add(input.nextInt());

        for(int i = 1; i < numbers.size(); i++){
            if(numbers.get(i) >= 100 ){
                numbers.remove(i--);

            }
        }


        System.out.println(numbers);
    }
}

package DailyPracticeJavaTaks;

import java.util.ArrayList;
import java.util.List;

public class StringInteger {
    public static void main(String[] args) {
        List<String> listOne = new ArrayList<>();
        listOne.add("one");
        listOne.add("two");
        listOne.add("three");
        List<String> listTwo = new ArrayList<>();
        listTwo.add("1");
        listTwo.add("2");
        listTwo.add("3");
        
        List<String> listThree = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            listThree.add(listOne.get(i));
            listThree.add(listTwo.get(i));
        }
    }
}
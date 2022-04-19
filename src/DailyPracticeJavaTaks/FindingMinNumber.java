package DailyPracticeJavaTaks;

public class FindingMinNumber {
    public static void main(String[] args) {


        int[] arr = {9,8,6,7,92,2};

        int min = arr[0];

        for(int i =0; i < arr.length; i++){

            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min );
    }
}

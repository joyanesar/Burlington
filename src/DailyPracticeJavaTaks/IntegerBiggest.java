package DailyPracticeJavaTaks;

public class IntegerBiggest {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,9,6,3,7,10};
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter some numbers");
        //int size = input.nextInt();
        //int[] arr = new int[size];

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(max);

    }
}


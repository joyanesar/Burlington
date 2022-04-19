package DailyPracticeJavaTaks;

public class test {
    public static void main(String[] args) {
        //move zeros to the end
        int[] arr = {1,0,0,4,0,2,0,3,5};
        //we need new array to store number
//        int[]newArray = new int[arr.length];
//        int count =0;
//        //for(int each: arr){
//        //if(each >0)
//        //new array[count++] = arr[i]
//        for(int i = 0 ; i <arr.length; i++){
//
//            if(arr[i] > 0){
//                newArray[count++] = arr[i];
//            }
//        }
//
//        System.out.println(Arrays.toString(newArray));

        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }else if(arr[i] <min){
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }


}

package DailyPracticeJavaTaks;

public class Divisible_By3_And_5 {
    /*
    and 3. Numbers -- Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.

if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section

if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section

if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section.
     */
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int num = input.nextInt();
        System.out.println("Numbers divisible by 3");
        for (int i = 1; i <= 100; i++)
            if (i % 3 == 0)
                System.out.print(i + " ");
        System.out.println();

        System.out.println("Numbers divisible in 5");
        for (int i = 1; i <= 100; i++)

            if (i % 5 == 0)
                System.out.print(i + " ");
        System.out.println();
        System.out.println("Numbers divisible in 3 & 5");
        for(int i =1 ; i <= 100; i++)
            if(i % 3 ==0 && i % 5 ==0)
                System.out.print(i + " ");
        System.out.println();
        System.out.println("Numbers divisible in 3 & 5 & 15");
        for (int i =1; i<= 100; i++)
            if(i % 3==0  && i % 5 ==0 && i % 15 ==0)
                System.out.print(i + " ");

    }
}




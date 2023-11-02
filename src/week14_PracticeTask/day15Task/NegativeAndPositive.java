package week14_PracticeTask.day15Task;

import java.util.Scanner;

public class NegativeAndPositive {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String countPositive ="";
        String  countNegative ="";
        int countPos=0;
        int countNeg=0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter your number");
            int userNumber = scan.nextInt();

            if (userNumber > 0) {
                countPositive+=userNumber+" ";
                countPos++;
            } else if (userNumber<0) {
                countNegative += userNumber + " ";
                countNeg++;
            } /* }else {
                System.err.println("ZERO"+userNumber);
            }*/
        }
        System.out.println("countPositive = " + countPositive);
        System.out.println("countPos = " + countPos);
        System.out.println();
        System.out.println("countNegative = " + countNegative);
        System.out.println("countNeg = " + countNeg);
        scan.close();
    }


}
/*2. Create a class named PositiveNegative and write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative*/


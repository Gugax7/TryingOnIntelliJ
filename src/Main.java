import java.beans.JavaBean;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverageMy();
    }
    public static void inputThenPrintSumAndAverageMy(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberCounter = 0;
        long average;
        boolean isNumber = true;
        //System.out.println("Print the numbers below:");
        while(isNumber){
            try {
                sum += Integer.parseInt(scanner.nextLine());
                numberCounter++;
                //scanner.nextLine();
            }catch (NumberFormatException e){
                isNumber = false;
            }

        }
        if(numberCounter == 0){
            average = 0;
        }
        else {
            average = Math.round((double)sum / numberCounter);
        }
        System.out.println("SUM = " + sum + " AVG = " + average);


    }
public static void inputThenPrintSumAndAverage() {

    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int count = 0;
    long avg = 0;

    while (true) {
        boolean hasNextInt = scanner.hasNextInt();
        if (!hasNextInt) {
            // break the loop on invalid input
            break;
        }
        sum += scanner.nextInt();
        count++;
        // clear buffer e.g. remove line separator
        scanner.nextLine();
    }

    if (count > 0) {
        avg = Math.round((double) sum / count);
    }

    System.out.println("SUM = " + sum + " AVG = " + avg);
    scanner.close();
}
}
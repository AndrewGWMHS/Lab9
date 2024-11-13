import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int [] dataPoints = new int[100];
        int sum = 0;
        double average = 0;
        int minValue= 0;
        int maxValue = 0;
        boolean numFound = false;

        for(int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100)+1;
            System.out.print(dataPoints[i] + " | ");
        }

        int total = sum(dataPoints);

        average = (double) total /dataPoints.length;

        minValue = min(dataPoints);

        maxValue = max(dataPoints);

        System.out.println();
        System.out.println(total);
        System.out.println(average);
        System.out.println(minValue);
        System.out.println(maxValue);

        int targetNum = InputHelper.getRangedInt(scan, "Enter a number from 1-100", 1, 100);
        int numOccured = occurenceScan(dataPoints, targetNum);
        System.out.println("Your number: " + targetNum + " appeared " + numOccured + " time(s).");

        targetNum = InputHelper.getRangedInt(scan, "Enter a number from 1-100", 1, 100);
        for (int i = 0; i < dataPoints.length; i++) {
            if (targetNum == dataPoints[i]) {
                System.out.println("Your number is in the index position " + i);
                numFound = true;
                break;
            }
        }

        if (!numFound) {
            System.out.println("Your number was not found inside of the array");
        }

    }

    public static int min(int values[]) {
        int minValue = 100;
        for(int i = 0; i < values.length; i++) {
            if (minValue > values[i]){
                minValue = values[i];
            }
        }
        return minValue;
    }

    public static int max(int values[]) {
        int maxValue = 0;
        for(int i = 0; i < values.length; i++) {
            if (maxValue < values[i]){
                maxValue = values[i];
            }
        }
        return maxValue;
    }

    public static int occurenceScan(int values[], int target) {
        int occurence = 0;
        for (int x : values) {
            if (x == target) {
                occurence++;
            }
        }
        return occurence;
    }

    public static int sum(int values[]) {
        int s = 0;
        for(int i = 0; i < values.length; i++) {
            s = s + values[i];
        }
        return s;
    }

}

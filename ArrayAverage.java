package arrays.concent;

public class ArrayAverage {
    public static void main(String args[]) {
        double[] numArray = {45.3, 67.5, -45.6, 20.34, 33.0, 45.6};
        double sum = 0.0;
        for (double num : numArray) {
            sum += num;
            System.out.println("The value of sum : " + sum);
        }
        double average = sum / numArray.length;
        System.out.println("The average is :" + average);
    }
}


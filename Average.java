package arrays.concent;

public class Average {
    public static void main(String args[]) {
        double num[] = {12.5, 76.9, 14.6, 19.5, 15.9};
        double result = 0;
        for (int i = 0; i <= 5; i++) {
            result = result + num[i];
            System.out.println("Average is " + result / 5);
            break;
        }
    }
}

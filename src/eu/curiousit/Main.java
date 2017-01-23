package eu.curiousit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите x");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextInt();


        Double res = getaDouble(x);

        System.out.println(res.toString());
    }

    private static Double getaDouble(double x) {
        Double res = Double.NaN;
        if (x < -9) {
            res = Double.NaN;
        } else if (x < -5) {
            res = 2 - Math.sqrt(4 - Math.pow(x + 7, 2));
        } else if (x < -4) {

        } else if (x < 0) {

        } else if (x < Math.PI) {

        } else if (x < 5) {

        } else {
            res = Double.NaN;
        }
        return res;
    }
}

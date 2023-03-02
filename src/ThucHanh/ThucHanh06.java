package ThucHanh;

import java.util.Scanner;

public class ThucHanh06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("Enter a year: ");
        year = scanner.nextInt();
        if (year > 0) {
            if ((year % 4 == 0 && year % 100 == 0 && year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.printf("%d is a leap year", year);
            } else {
                System.out.printf("%d is NOT a leap year", year);
            }
        } else {
            System.out.printf("%d is out of AD range",year);
        }

    }
}

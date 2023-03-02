package ThucHanh;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        boolean yearCheck =(year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        if (year > 0) {
            if (yearCheck) {
                System.out.printf("%d is a leap year", year);
            } else {
                System.out.printf("%d is NOT a leap year", year);
            }
        } else {
            System.out.printf("%d is out of AD range", year);
        }
    }
}

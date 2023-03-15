package pages;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ile masz lat?");
        float wiek = scanner.nextFloat();

        if (wiek >= 18) {
            System.out.println("Możesz kupić alkohol");
        } else if (wiek < 18 && wiek >= 0) {
            System.out.println("Przykro mi nie mozesz kupic alkoholu");
        } else if ( wiek < 0) {
            System.out.println("Prosze podaj prawidlowa liczbe");
        }
    }
}

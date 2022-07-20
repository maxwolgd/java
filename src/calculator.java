// moje rozwiązanie pracy domowej
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Prosze, podaj pierwsza liczbe");
        float firstNumber = scanner.nextInt();
        System.out.println(" Prosze, podaj druga liczbe");
        float secondNumber = scanner.nextInt();
        float result1 = firstNumber + secondNumber;
        float result2 = firstNumber - secondNumber;
        float result3 = firstNumber * secondNumber;
        float result4 = firstNumber / secondNumber;
        System.out.println("Wynik dodawania to: " + result1);
        System.out.println("Wynik odejmowania to: " + result2);
        System.out.println("Wynik mnożenia to: " + result3);
        System.out.println("Wynik dzielenia to: " + result4);

    }
}


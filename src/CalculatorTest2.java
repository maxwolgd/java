import java.util.Scanner;

public class CalculatorTest2 {
    public static void main(String[] args) {
        Calculator2 calculator2 = new Calculator2();


        Scanner scanner = new Scanner(System.in);
        System.out.println(" Prosze, podaj pierwsza liczbe");
        calculator2.firstNumber = scanner.nextInt();
        System.out.println(" Prosze, podaj druga liczbe");
        calculator2.secondNumber = scanner.nextInt();


        calculator2.add(calculator2.firstNumber, calculator2.secondNumber, "Wynik dodawania to:");
        calculator2.minus(calculator2.firstNumber, calculator2.secondNumber, "Wynik odejmowania to:");
        calculator2.divide(calculator2.firstNumber, calculator2.secondNumber, "Wynik dzielenia to:");
        calculator2.multiplication(calculator2.firstNumber, calculator2.secondNumber, "Wynik mnozenia to:");

    }
}
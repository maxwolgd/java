import java.util.Scanner;

public class CustomScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Prosze, podaj pierwsza liczbe");
        int firstNumber = scanner.nextInt();
        int result = firstNumber * firstNumber;
        System.out.println("Kwadrat tej liczby to: " + result);
    }
}

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class OperatoryPorownanie {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println(" Prosze, podaj pierwsza liczbe");
        int firstNumber = (int)scanner.nextInt();
        System.out.println(" Prosze, podaj druga liczbe");
        int secondNumber = (int)scanner.nextInt();


        boolean result = secondNumber > firstNumber;

        System.out.println(result);
        System.out.println("a > b " +  (firstNumber > secondNumber));
        System.out.println("a < b " +  (firstNumber < secondNumber));
        System.out.println("a >= b " + (firstNumber >= secondNumber));
        System.out.println("a >= b " + (firstNumber <= secondNumber));
        System.out.println("a == b " + (firstNumber == secondNumber));
        System.out.println("a != b " + (firstNumber != secondNumber));
    }

}

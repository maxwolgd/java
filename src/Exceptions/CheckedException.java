package Exceptions;

import java.util.Scanner;

public class CheckedException {

    public static void main(String[] args) throws InvalidAgeException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek");
        int age = scanner.nextInt();
        if(age<0) {
            throw new InvalidAgeException("Age is not valid");
        }
        if(age>=18){
            System.out.println("Jesteś pelnoletni");
        } else {
            System.out.println("Nie jestes pelnoletni");
        }


    }
}

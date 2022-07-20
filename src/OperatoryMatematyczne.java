public class OperatoryMatematyczne {
    public static void main(String[] args) {

        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber;
        int substraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = thirdNumber/secondNumber;
        int mod = secondNumber%firstNumber;


        System.out.println("Wynik dodawania: " + addition);
        System.out.println("Wynik odejmowania: " + substraction);
        System.out.println("Wynik mnozenia: " + multiplication);
        System.out.println("Wynik dzielenia: " + division);
        System.out.println("Wynik mod: " + mod);


        //inny zapis

        firstNumber+=secondNumber;
        System.out.println("Dodawanie: " + firstNumber);
    }



}

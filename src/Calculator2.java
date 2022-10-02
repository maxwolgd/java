public class Calculator2 {

    public int firstNumber;
    public int secondNumber;

    public void add(float firstNumber, float secondNumber, String word) {
        float result = firstNumber + secondNumber;
        System.out.println(word + result);
    }

    public void minus(float firstNumber, float secondNumber, String word) {
        float result = firstNumber - secondNumber;
        System.out.println(word + result);
    }

    public void divide(float firstNumber, float secondNumber, String word) {
        float result = firstNumber / secondNumber;
        System.out.println(word + result);
    }

    public void multiplication(float firstNumber, float secondNumber, String word) {
        float result = firstNumber * secondNumber;
        System.out.println(word + result);
    }


}

//// praca domowa jak mozna wykonac inaczej:
//public int add(int firstNumber, int secondNumber) {
//    return firstNumber + secondNumber;
//}
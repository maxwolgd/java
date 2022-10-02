public class OperatoryLogiczne {
    public static void main(String[] args) {


//    boolean firstValue = true;
//    boolean secondValue = false;
//    boolean thirdValue = false;
//    boolean fourthValue = true;


        boolean firstValue =  2 > 1;
        boolean secondValue = 2 < 1;
        boolean thirdValue = 3 > 4;
        boolean fourthValue = true;


        // && -> wtedy gdy wyrażenia składowe są równe true
        System.out.println("&&");
        System.out.println(firstValue && secondValue); // false
        System.out.println(firstValue && fourthValue); // true
        System.out.println(secondValue && thirdValue); // false

    // || -> true gdy jedno wyrazenie składowe jest równe true
        System.out.println("||");
        System.out.println(firstValue  || secondValue);   // true
        System.out.println(firstValue  || fourthValue);   // true
        System.out.println(secondValue || thirdValue);    // false

        // ! negacja - zwraca wartość przeciwną do wyrazenia przed ktorym sie znajduje
        System.out.println("NEGACJA");
        System.out.println(!firstValue);  // false
        System.out.println(!thirdValue);  // true
        System.out.println(!(firstValue&&secondValue)); //true

    }
}

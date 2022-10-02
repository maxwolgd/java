public class DoWhile {
    public static void main(String[] args) {
        int number = 19;
        do {
            System.out.println("Moja wartosc to : " + number + " i jest mniejsza od 20");
            number++;
        } while (number<20);
    }
}


// Do while wykona sie co najmniej raz, nawet jak warunek jest false. Musimy korzystac z while bo tutaj jest najpierw sprawdzenie czy jest true
public class Switch {

    public static void main(String[] args) {

        String meal = "Pizza";

        switch (meal) {
            case "Pizza" -> System.out.println("Cena to 22 zl");
            case "Losos" -> System.out.println("Cena to 35 zl");
            case "Frytki" -> System.out.println("Cena to 9 zl");
            default -> System.out.println("Brak dania w karcie");
        }
    }
}

public class Footballer extends Person {


    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        System.out.println("Jestem w konstrktorze footballer");
        this.footballClub = footballClub;
    }

    public void playFootball(){


        System.out.println("I am playing football for " + footballClub);
    }
}

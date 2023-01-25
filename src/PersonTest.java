public class PersonTest {

    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 29, "Awf");
        teacher.walk();
        teacher.eat();
        teacher.teachMath();
        teacher.sayHello();

        Footballer footballer = new Footballer("Saka", 21,"Arsenal London");
        footballer.walk();
        footballer.eat();
        footballer.playFootball();
    }

}

import java.sql.Time;
// nie da się nadpisać final ani dziedziczyc klasy jesli jest final
public class FinalTest {

    public static void main(String[] args) {
        final int x = 2;

        final Person person = new Person("Tim", 26);
        person.age = 25;


    }
}

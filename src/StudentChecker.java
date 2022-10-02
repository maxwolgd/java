import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;


public class StudentChecker {
    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;

        Student adam = new Student();
        adam.imie = "Adam";
        adam.nazwisko = "Marecki";
        adam.nick = "Adam666";
        adam.numerIndeksu = "123";
        adam.email = "a@wp.pl";
        String uczelniaAdama = adam.nazwaUczelni;


        Student kasia = new Student();
        kasia.imie = "Kasia";
        kasia.nazwisko = "Mamma";
        kasia.nick = "Kas";
        kasia.numerIndeksu = "465";
        kasia.email = "k@wp.pl";

        Student mirek = new Student();
        mirek.imie = "Mirek";
        mirek.nazwisko = "Lewandowski";
        mirek.nick = "Lewy";
        mirek.numerIndeksu = "666";
        mirek.email = "mmmmmm@wp.pl";

        Student[] students = new Student[3];
        students[0] = adam;
        students[1] = kasia;
        students[2] = mirek;

        for (int i = 0; i < students.length; i++){
            students[i].zalogujSie();
            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].podajNrIndeksu();

        }

//        String imie = "Kasia";
//        imie.strip();
//        Scanner scanner = new Scanner(System.in);

    }
}




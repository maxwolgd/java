public class AutoTest2 {

        public static void main(String[] args) {

            Auto2 auto2 = new Auto2("Mercedes","Xklasa", 1999,233111 );


            System.out.println("Marka to " + auto2.marka);
            System.out.println("Model to " + auto2.model);
            System.out.println("Rok produkcji to " + auto2.rokProdukcji);
            System.out.println("Przebieg " + auto2.przebieg);

            auto2.przyspiesz();

        }
      }



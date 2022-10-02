public class MetodyTest {
    public static void main(String[] args) {


        Metody metody = new Metody();
//        metody.policzWynik();
//
////        int result = metody.policzWynik();  - udowodnienie, że void nie zwraca wyniku
//
//        int result = metody.pobierzWynik();
//        int result2 = result *2;
//
////        System.out.println("Rezultat po mnożeniu " + result2);
//        metody.policzWynikParam(2);
        metody.policzWynikParam(100);
//        metody.policzWynikParam(23);

        int result = metody.add(2,3,"hello");
        System.out.println(metody.add(6,3,"tak"));
        System.out.println(result);

    }
}

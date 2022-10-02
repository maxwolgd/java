public class PracaDomowa2 {
    public static void main(String[] args) {

//        for (int i = 0; i < 100; i++) {
//            if(i%3==0)
//            System.out.println(i);


          int[] liczby = new int[]  {1,3,5,7,0};


            for (int i=0;i<(liczby.length/2);i++) {
                int temp = liczby[i]; // dla i=0 i=1 3
                liczby[i] = liczby[liczby.length-1-i]; // 4 -> 0 3
                liczby[liczby.length-1-i] = temp; //1 // numbers[3] =3
                System.out.println("Iteracja numer " + i);
            }

            for (int i=0; i<liczby.length;i++ )
                System.out.println(liczby[i]);
    }
}
        

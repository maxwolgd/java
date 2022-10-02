public class Tablice {

    public static void main(String[] args) {
        String[] imiona = new String[3];
        imiona[0] = "Bartek";
        imiona[1] = "Basia";
        imiona[2] = "Michal";

        System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);

        int[] lottonumbers = new int[] {1,2,3,4,5,6};
        System.out.println(lottonumbers[0]);
        System.out.println(lottonumbers[1]);
        System.out.println(lottonumbers[2]);
        System.out.println(lottonumbers[3]);
        System.out.println(lottonumbers[4]);
        System.out.println(lottonumbers[5]);


        System.out.println(lottonumbers.length);

        for (int i=0; i< imiona.length;i++){
            System.out.println(imiona[i]);
        }

    }


}

public class AppChecker {

    public static void main(String[] args) {

        AndroidApp android = new AndroidApp("calculator");
        android.appInfo();
        android.runAndroidApp();


        IphoneApp iphoneApp = new IphoneApp("calculator");
        iphoneApp.appInfo();
        iphoneApp.runIphoneApp();



    }


}


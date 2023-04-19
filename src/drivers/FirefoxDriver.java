package drivers;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwieram przeglądarkę firefox");

    }

    @Override
    public void findElementby() {
        System.out.println("Znajduje element na stronie w firefox");

    }
}

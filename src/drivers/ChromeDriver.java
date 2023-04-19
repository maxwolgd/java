package drivers;

public class ChromeDriver implements WebDriver {

    @Override
    public void name() {

    }

    @Override
    public void get() {
        System.out.println("Otwieram przeglądarkę chrome");

    }

    @Override
    public void findElementby() {
        System.out.println("Znajduje element na stronie w chrome");

    }
}

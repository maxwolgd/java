import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ConversionCasting {
    public static void main(String[] args) {
        int a = 11;
        double b = 2;

        double c = a/b;


        int d = a/(int) b;

        System.out.println(c);
        System.out.println(d);

        WebDriver driver = new FirefoxDriver();

        FirefoxDriver firefoxDriver = (FirefoxDriver)driver;
        firefoxDriver.get();

    }
}

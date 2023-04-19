package drivers;

public class WebDriverTest {
    public static void main(String[] args) throws NoValidBrowserName {

        WebDriver driver = getDriver("fiarefox");
        driver.name();
        driver.get();
        driver.findElementby();
        driver.findElementby();
        driver.findElementby();
        driver.findElementby();
        driver.findElementby();
        driver.findElementby();
    }


//        Firefox firefox = new Firefox();
//        firefox.get();
//        firefox.findElementby();
//        firefox.findElementby();
//        firefox.findElementby();
//        firefox.findElementby();
//        firefox.findElementby();
//        firefox.findElementby();

    private static WebDriver getDriver(String name) throws NoValidBrowserName {
        if (name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        }
        throw new NoValidBrowserName("No valid browser name");
    }
}

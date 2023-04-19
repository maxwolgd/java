package drivers;

public interface WebDriver {


    default void name(){
        System.out.println("chrome");
    }
    void get();
    void findElementby();


}

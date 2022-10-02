public class UserTests {
    public static void main(String[] args) {

//        User user = new User();
        User user = new User("Tomek", "Hello");
//
//        user.username = "Bartek";
//        user.password = "QWERTY";

        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();
    }
}

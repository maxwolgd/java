public class User {

    public String username;
    public String password;



    public User(String username, String password) {
        System.out.println("Konstruktor");
        this.username = username;
        this.password = password;

    }

//    public User(String user, String pass) {
//        System.out.println("Konstruktor");
//        username = user;
//        password = pass;
//    }

    public void sayHello(){
        System.out.println("Hello my name is " + username);
    }
}

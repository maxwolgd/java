public class MathTeacher extends Person {

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        System.out.println("Jestem w konstrktorze mathTEacher");
        this.school = school;
    }

    public void walk() {
        System.out.println("I like walk very fast");
    }

    public void teachMath() {
        System.out.println("I am teaching math");
    }

    public void sayHello() {
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age);
    }

}

package identifiers.second;

import identifiers.first.Parent;

// klasa potomna w innej paczce nie ma dostępu do pól/metod private
// oraz default
// oraz do protected

public class RandomTest {

    public void testIdentifiers() {
        Parent parent = new Parent();

        System.out.println(parent.first);
//        System.out.println(parent.second);
//        System.out.println(parent.third);
//        System.out.println(parent.fourth);
        parent.firstMethod();
//        parent.secondMethod();
//        parent.thirdMethod();
//        parent.fourthMethod();

    }
}

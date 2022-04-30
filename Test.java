import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    static ArrayList<Person> people = new ArrayList<>() ;

    public static void main(String[] args) {
        Person defaultPerson1 = new Person();
        defaultPerson1.setName("sabih");
        people.add(defaultPerson1);

        Person defaultPerson2 = new Person();
        defaultPerson2.setName("viator");
        people.add(defaultPerson2);


        System.out.println("FIND WHO?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        PeopleManagement management = new PeopleManagement();

        try {

            System.out.println(management.findPerson(name,people));
        }
        catch (PersonNotFoundExceptionClass ex)
        {
            System.out.println(ex.getMessage());
        }

    }

}

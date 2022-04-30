import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Person> people = new ArrayList<>() ;

    public static void main(String[] args) {

        System.out.println("FIND WHO?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

    }

    public void defaultPeople()
    {
        Person ali = new Person();
        ali.setName("Ali");

        Person viator = new Person();
        viator.setName("Viator");

        people.add(ali);
        people.add(viator);
    }


}

import java.util.ArrayList;

public class PeopleManagement {

    public String findPerson(String name , ArrayList<Person> people) throws PersonNotFoundExceptionClass
    {
        for (int i = 0 ; i < people.size() ; i++)
        {
            if (people.get(i).getName().equals(name))
            {
                return "WE CALL " + name ;
            }
        }

        {
            throw new PersonNotFoundExceptionClass(
                    name + " not found !"
            );
        }
    }
}

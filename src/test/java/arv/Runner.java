package arv;

import arv.id.PersonID;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Runner {
    public static void main(String[] args) {
        //Create and list that can contain Person objects
        List<Person> persons = new ArrayList<>();
        // fill the list with 10  Person objects
        for (int i = 0; i < 10; i++) {
            persons.add(
                    Person.builder()
                            .id(PersonID.builder()
                                    .id("123456789" + i)
                                    .build())
                            .firstName("Testing" + i)
                            .lastName("Testingson" + i)
                            .build()
            );
        }

        List<String> names = persons
                .stream() // loop the list using stream
                .filter(Objects::nonNull)   // check that the current object is not null
                .peek(System.out::println)  // use peek to log the current object to system out
                .map(p -> p.getLastName() + ", " + p.getFirstName()) // get the last and first name, concatinate them to a string
                .toList(); // collect the strings in a list

        names.forEach(System.out::println); // for each string in the list print the string to system out
    }
}

package arv;

import arv.id.ContactInfoID;
import arv.id.PersonID;
import dev.personnummer.Personnummer;
import dev.personnummer.PersonnummerException;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Runner {
    public static void main(String[] args) throws Exception{
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
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
                            .personnummer(getPersonnummer(i))
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

        EmailContactInformation emailContactInformation = EmailContactInformation.builder()
                .id(ContactInfoID.builder().build())
                .personID(PersonID.builder()
                        .id("1234567890")
                        .build())
                .email("test@test.se.com")
                .build();

        Set<ConstraintViolation<EmailContactInformation>> violations = validator.validate(emailContactInformation);
        violations.forEach(System.out::println);
        Set<ConstraintViolation<Person>> violationsPerson = validator.validate(persons.get(0));
        violationsPerson.forEach(System.out::println);

        persons.forEach(person -> {
            System.out.println(person.getGender());
        });

    }

    private static Personnummer getPersonnummer(int i) throws PersonnummerException {
        return i%2==0? new Personnummer("189001049817"):new Personnummer("189001019802");
    }
}

package arv;

import arv.id.PersonID;
import arv.type.Gender;
import dev.personnummer.Personnummer;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@SuperBuilder
@Getter
@ToString(callSuper = true)
public class Person extends AbstractEntity<PersonID> {
    @NotNull(message = "firstName cannot be null")
    private final String firstName;
    @NotNull(message = "lastName cannot be null")
    private final String lastName;
    @NotNull(message = "personnummer(Swedish SSN) cannot be null")
    private final Personnummer personnummer;


    public Gender getGender() {
        if(this.personnummer.isFemale()) {
            return Gender.FEMALE;
        }
        if(this.personnummer.isMale()) {
            return Gender.MALE;
        }
        return Gender.NON_BINARY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(personnummer, person.personnummer) &&
                Objects.equals(getId(),((Person) o).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, personnummer,getId());
    }
}

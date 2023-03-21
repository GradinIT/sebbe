package arv;

import arv.id.PersonID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@ToString(callSuper = true)
@EqualsAndHashCode
public class Person extends AbstractEntity<PersonID> {
    private final String firstName;
    private final String lastName;

}

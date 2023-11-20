package arv;

import arv.id.ContactInfoID;
import arv.id.PersonID;
import arv.type.ContactInfoType;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

@SuperBuilder
@ToString(callSuper = true)
public abstract class ContactInformation extends AbstractEntity<ContactInfoID> {
    @NotNull(message = "personID cannot be null")
    private final PersonID personID;
    public abstract ContactInfoType getContactInfoType();
}

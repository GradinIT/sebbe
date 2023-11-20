package arv;

import arv.type.ContactInfoType;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Email;

@SuperBuilder
@Getter
public class EmailContactInformation extends ContactInformation{
    private static final ContactInfoType contactInfoType = ContactInfoType.EMAIL;
    @Email(message = "Email should be valid",
            regexp = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")
    private final String email;
    @Override
    public ContactInfoType getContactInfoType() {
        return contactInfoType;
    }
}

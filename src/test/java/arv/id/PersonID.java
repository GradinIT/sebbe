package arv.id;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString(callSuper = true)
public class PersonID extends EntityID<String>{
}

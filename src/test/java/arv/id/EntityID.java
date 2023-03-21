package arv.id;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@ToString
public abstract class EntityID<ID> {
    private ID id;
}

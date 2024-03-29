package arv;

import arv.id.EntityID;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

@SuperBuilder
@Getter
@ToString
public abstract class AbstractEntity<ID extends EntityID> {
    @NonNull
    private final ID id;

}

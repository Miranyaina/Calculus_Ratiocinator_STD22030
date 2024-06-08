package Lab.Affirmation;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Affirmation {
    protected final long affirmationId;
    protected final String affirmationInput;
}

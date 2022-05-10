import types.ComedyType;
import types.Type;
import types.TragedyType;
import types.UnknownType;

import static enums.PlayTypes.COMEDY;
import static enums.PlayTypes.TRAGEDY;

public class Play {

    private String name;
    private Type type;

    public Play(String name, String type) {
        this.name = name;
        this.type = generateTypeFactory(type);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    private Type generateTypeFactory(String type) {
        if (type.equals(COMEDY.getValue())) {
            return new ComedyType();
        } else if (type.equals(TRAGEDY.getValue())) {
            return new TragedyType();
        } else {
            return new UnknownType();
        }
    }
}

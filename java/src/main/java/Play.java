import playtypes.Comedy;
import playtypes.PlayType;
import playtypes.Tragedy;
import playtypes.UnknownType;

import static enums.PlayTypes.COMEDY;
import static enums.PlayTypes.TRAGEDY;

public class Play {

    private String name;
    private PlayType type;

    public Play(String name, String type) {
        this.name = name;
        this.type = generateTypeFactory(type);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(PlayType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public PlayType getType() {
        return type;
    }

    private PlayType generateTypeFactory(String type) {
        if (type.equals(COMEDY.getValue())) {
            return new Comedy();
        } else if (type.equals(TRAGEDY.getValue())) {
            return new Tragedy();
        } else {
            return new UnknownType();
        }
    }
}

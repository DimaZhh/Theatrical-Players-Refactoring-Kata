package enums;

public enum PlayTypes {

    TRAGEDY("tragedy"),
    COMEDY("comedy");

    public final String value;

    PlayTypes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

public class Performance {

    private Play play;
    private int audience;

    public Performance(Play play, int audience) {
        this.play = play;
        this.audience = audience;
    }

    public void setPlay(Play play) {
        this.play = play;
    }

    public void setAudience(int audience) {
        this.audience = audience;
    }

    public Play getPlay() {
        return play;
    }

    public int getAudience() {
        return audience;
    }
}

public class Keyboard {


    private boolean highlights;
    private boolean additional;


    public Keyboard(boolean highlights, boolean additional) {
        this.additional=additional;
        this.highlights=highlights;
    }

    public void setHighlights(boolean highlights) {
        this.highlights = highlights;
    }

    public void setAdditional(boolean additional) {
        this.additional = additional;
    }


    public boolean isAdditional() {
        return additional;
    }

    public boolean isHighlights() {
        return highlights;
    }
}

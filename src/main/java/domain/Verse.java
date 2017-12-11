package domain;

public class Verse {

    private String text;

    public Verse(String text){
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Verse verse = (Verse) o;

        return text != null ? text.equals(verse.text) : verse.text == null;
    }

    @Override
    public int hashCode() {
        return text != null ? text.hashCode() : 0;
    }

    @Override
    public String toString() {
        return text.substring(0,1).toUpperCase() + text.substring(1);
    }
}

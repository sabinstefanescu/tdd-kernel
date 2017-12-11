package domain;

import java.util.ArrayList;
import java.util.List;

public class Stanza {

    private List<Verse> verses = new ArrayList<>();

    public List<Verse> getVerses() {
        return verses;
    }

    public void addVerse(Verse verse){
        verses.add(verse);
    }

    @Override
    public String toString() {
        StringBuffer stanza = new StringBuffer();
        for (Verse v:verses) {
            stanza.append(v);
            stanza.append("\n\r");
        }

        return stanza.toString();
    }
}

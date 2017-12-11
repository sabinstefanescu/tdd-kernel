package domain;

import java.util.ArrayList;
import java.util.List;

public class Singing {

    private List<Stanza> stanzas = new ArrayList<>();


    public List<Stanza> getStanzas() {
        return stanzas;
    }

    public void addStanza(Stanza stanza) {
        this.stanzas.add(stanza);
    }

    @Override
    public String toString() {
        StringBuffer stanza = new StringBuffer();
        for (Stanza s:stanzas) {
            stanza.append(s);
            stanza.append("\n\r");
        }

        return stanza.toString();
    }
}

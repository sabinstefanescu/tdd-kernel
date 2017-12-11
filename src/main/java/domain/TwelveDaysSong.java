package domain;

import domain.services.NumberService;
import domain.services.PresentsService;

public class TwelveDaysSong implements Song {

    private NumberService numberService = new NumberService();

    private PresentsService presentsService = new PresentsService();

    @Override
    public Singing sing() {
        Singing singing = new Singing();
        for (int i = 1; i<=12; i++) {
            Stanza s = new Stanza();
            s.addVerse(getFirstVerseOfStanza(i));
            s.addVerse(getSecondVerseOfStanza());

            for (int j = i; j>=1; j--){
                s.addVerse(getNthVerseOfStanza(j, i));
            }

            singing.addStanza(s);
        }

        return singing;
    }

    private Verse getFirstVerseOfStanza(Integer stanzaNo){
        return new Verse("On the " + numberService.getOrdinal(stanzaNo) + " day of Christmas");
    }

    private Verse getSecondVerseOfStanza(){
        return new Verse("my true love gave to me");
    }

    private Verse getNthVerseOfStanza(Integer verseNo, Integer stanzaNo){
        if (verseNo == 1 && stanzaNo != 1){
            return new Verse("And " + numberService.getCardinal(verseNo) + " " + presentsService.getPresent(verseNo));
        }
        else{
            return new Verse(numberService.getCardinal(verseNo) + " " + presentsService.getPresent(verseNo));
        }


    }


}

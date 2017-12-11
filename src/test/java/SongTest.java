import domain.Singing;
import domain.Song;
import domain.TwelveDaysSong;
import domain.Verse;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SongTest {

    private Song twelveDaysSong = new TwelveDaysSong();

    @Test
    public void testSongInstantiation(){
       Song song = new TwelveDaysSong();

        Assertions.assertThat(song).isNotNull();
    }

    @Test
    public void testSongSingNotNull(){
        Song song = new TwelveDaysSong();

        Singing singing = song.sing();

        Assertions.assertThat(singing).isNotNull();
    }

    @Test
    public void testSingingHasTwelveStanzas(){

        Singing singing = twelveDaysSong.sing();

        Assertions.assertThat(singing.getStanzas().size()).isEqualTo(12);
    }

    @Test
    public void testFirstStanzaForThreeVarses(){

        Singing singing = twelveDaysSong.sing();

        Assertions.assertThat(singing.getStanzas().get(0).getVerses().size()).isEqualTo(3);

    }

    @Test
    public void testFirstStanzaFirstVerse(){
        Singing singing = twelveDaysSong.sing();

        Assertions.assertThat(singing.getStanzas().get(0).getVerses().get(0)).isEqualTo(new Verse("On the first day of Christmas"));
    }

    @Test
    public void testFirstStanzaThirdVerse(){
        Singing singing = twelveDaysSong.sing();

        Assertions.assertThat(singing.getStanzas().get(0).getVerses().get(2)).isEqualTo(new Verse("a partridge in a pear tree"));
    }

    @Test
    public void testSecondStanzafourthVerse(){
        Singing singing = twelveDaysSong.sing();

        Assertions.assertThat(singing.getStanzas().get(1).getVerses().get(3)).isEqualTo(new Verse("And a partridge in a pear tree"));
    }



}

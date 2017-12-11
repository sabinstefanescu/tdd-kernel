import domain.Song;
import domain.TwelveDaysSong;

public class Main {


    public static void main(String args[]){
        Song s = new TwelveDaysSong();

        System.out.print(s.sing().toString());
    }

}

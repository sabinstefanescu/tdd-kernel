package domain.services;

import java.util.HashMap;
import java.util.Map;

public class NumberService {

    private static final Map<Integer, StringNumber> numberRepresentations = new HashMap<>();
    {
        numberRepresentations.put(1, new StringNumber("a", "first"));
        numberRepresentations.put(2, new StringNumber("two", "second"));
        numberRepresentations.put(3, new StringNumber("three", "third"));
        numberRepresentations.put(4, new StringNumber("four", "fourth"));
        numberRepresentations.put(5, new StringNumber("five", "fifth"));
        numberRepresentations.put(6, new StringNumber("six", "sixth"));
        numberRepresentations.put(7, new StringNumber("seven", "seventh"));
        numberRepresentations.put(8, new StringNumber("eight", "eighth"));
        numberRepresentations.put(9, new StringNumber("nine", "ninth"));
        numberRepresentations.put(10, new StringNumber("ten", "tenth"));
        numberRepresentations.put(11, new StringNumber("eleven", "eleventh"));
        numberRepresentations.put(12, new StringNumber("twelve", "twelfth"));
    }


    public String getCardinal(Integer number) {
        return numberRepresentations.get(number).cardinal;
    }

    public String getOrdinal(Integer number) {
        return numberRepresentations.get(number).ordinal;
    }

    private static final class StringNumber{

        private String cardinal;

        private String ordinal;

        private StringNumber(String cardinal, String ordinal){
            this.cardinal = cardinal;

            this.ordinal = ordinal;
        }

    }


}

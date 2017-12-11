package domain.services;

import java.util.HashMap;
import java.util.Map;

public class PresentsService {

    private static final Map<Integer, String> presents = new HashMap<>();
    {
        presents.put(1, "partridge in a pear tree");
        presents.put(2, "turtle doves");
        presents.put(3, "french hens");
        presents.put(4, "calling birds");
        presents.put(5, "golden rings");
        presents.put(6, "geese-a-laying");
        presents.put(7, "swans-a-swimming");
        presents.put(8, "maids-a-milking");
        presents.put(9, "ladies dancing");
        presents.put(10, "lords-a-leaping");
        presents.put(11, "pipers piping");
        presents.put(12, "drummers drumming");
    }

    public String getPresent(Integer day) {
        return presents.get(day);
    }
}

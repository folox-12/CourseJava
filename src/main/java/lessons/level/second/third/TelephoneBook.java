package lessons.level.second.third;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TelephoneBook {
    private final HashMap<String, List<String>> telephoneStorages = new HashMap<>();

    public TelephoneBook() {
    }

    public void add(String surname, String telephoneNumber) {
        if (telephoneStorages.containsKey(surname)) {
            telephoneStorages.get(surname).add(telephoneNumber);
        } else {
            telephoneStorages.put(surname,new ArrayList<>(List.of(new String[]{telephoneNumber})));
        }
    }

    public List get(String surname) {
        return telephoneStorages.get(surname);
    }
}

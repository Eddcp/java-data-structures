package hash;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public char process(String s) {
        char[] characters = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char character : characters) {
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }

        for (char character : characters) {
            if (map.get(character) == 1) return character;
        }

        return '_';
    }
}

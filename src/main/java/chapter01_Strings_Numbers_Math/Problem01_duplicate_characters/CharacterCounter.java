package chapter01_Strings_Numbers_Math.Problem01_duplicate_characters;

import java.util.HashMap;

public class CharacterCounter {

    // This hashmap stores a character and the number its number of occurrences
    private final HashMap<Character, Integer> counterHashMap = new HashMap<>();

    public void updateCounter(char character) {
        if(!counterHashMap.containsKey(character)) {
            // Character is not in hashmap, inserting new character with an occurrence of one
            counterHashMap.put(character, 1);

        } else {
            // Character is in hashmap, updating counter
            counterHashMap.put(character, counterHashMap.get(character) + 1);


        }
    }

    public void printDuplicateCharacters() {

        // Java streams forEach method - Prints out characters
        counterHashMap.forEach((k,v) -> {
            if (v > 1) {
                System.out.printf("\nCharacter: %c\tNumber of occurrences: %d\n", k, v);
            }
        });


    }// End of printDuplicateCharacters

    public void resetCounter() {

        counterHashMap.clear();

    }





} // End of class

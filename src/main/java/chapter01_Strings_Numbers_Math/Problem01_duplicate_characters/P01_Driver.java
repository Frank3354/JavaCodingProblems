package chapter01_Strings_Numbers_Math.Problem01_duplicate_characters;

/*
*   This class contains the main method that tests CharacterCounter's method to count duplicate characters in a string
*
*   Sample strings are contained in a separate file in current directory as this class.
*
*   Generated strings are from random.org
* */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P01_Driver {
    public static void main(String[] args) {
        // Getting the current working directory
        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Current working directory is " + currentDirectory);
        CharacterCounter counter = new CharacterCounter();

        try {
            File file = new File(currentDirectory + "\\test-files\\" +"Sample-strings.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            int lineNum = 1;
            char character;

            // Read and process line by line in opened file
            while((line=br.readLine()) != null) {
                System.out.printf("Line number %d. Line contents: %s", lineNum++, line);
                int numChars = line.length();

                // Process all characters in line
                for(int i = 0; i < numChars; i++) {
                    character = line.charAt(i);
                    counter.updateCounter(character);
                }

                counter.printDuplicateCharacters();
                counter.resetCounter();

                System.out.println("\n\n");
            }

            fr.close();
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}

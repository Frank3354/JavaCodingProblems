package HelperClasses.FileProcessor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileProcessor {
    private final ArrayList<String> linesInFile = new ArrayList<>();
    private int indexCounter;
    private int  numLines;

    public int getIndexCounter() {
        return indexCounter;
    }

    public void setIndexCounter(int indexCounter) {
        if(indexCounter >= numLines || indexCounter < 0 ) {this.indexCounter = 0; return;}

        this.indexCounter = indexCounter;
    }

    public int getNumLines() {
        return numLines;
    }

    public void setNumLines(int numLines) {
        this.numLines = numLines;
    }

    public FileProcessor(String fileName) {
        String currentDirectory = System.getProperty("user.dir");

        try {
            File file = new File(currentDirectory + "\\test-files\\" + fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            int lineNum = 1;


            // Read and process line by line in opened file
            while((line=br.readLine()) != null) {
                linesInFile.add(line);
            }

            // Closing file
            fr.close();
            numLines = linesInFile.size();
        } catch(IOException e) {
            e.printStackTrace();
        }

    }


    public String getNextLine() {
        if(indexCounter >= numLines) {indexCounter = 0;}
        return linesInFile.get(indexCounter++);
    }


} // End of class

package HelperClasses.FileProcessor;

public class FileProcessorDriver {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("sample-strings.txt");

        System.out.println(fileProcessor.getNextLine());
        System.out.println(fileProcessor.getNextLine());
        System.out.println(fileProcessor.getNextLine());
    }
}

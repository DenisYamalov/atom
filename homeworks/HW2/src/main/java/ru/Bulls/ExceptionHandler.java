package ru.Bulls;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandler {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ru.Bulls.ExceptionHandler.class);


    /**
     * Try with resources.
     *
     * @See {@link AutoCloseable}
     */
    public static String readOneLineFromFile_TheNewWay(String filename) {
        /*filename = "dictionary.txt";*/
        File file = new File(filename);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            return bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            log.warn("FileNotFoundException in readOneLineFromFile_TheNewWay, filename = {}", filename);
            return null;
        } catch (IOException e) {
            log.warn("IOException in readOneLineFromFile_TheNewWay, filename = {}", filename);
            return null;
        }
    }
}
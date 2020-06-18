package ru.Bulls;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Words {

    Random rand = new Random(System.currentTimeMillis());
    //setting source file
    List A = ResourceReader.readFromResource("dictionary.txt");
    ArrayList<String> k = new ArrayList<>();
    //choose random word
    String randomWord = (String) A.get(rand.nextInt(A.size()));

    public Words() throws IOException {
    }

    //getter of random word
    public String getRandomWord() {
        return randomWord;
    }

    String userWord;

    public String getUserWord() {
        return userWord;
    }

    public void setUserWord(String userWord) {
        this.userWord = userWord;
    }

}

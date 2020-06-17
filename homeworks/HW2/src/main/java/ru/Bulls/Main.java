package ru.Bulls;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //setting file
        List A = ResourceReader.readFromResource("dictionary.txt");
        //getting random word
        String randomWord = new CountVowelConsonant().getRandomWord();

        System.out.println("Welcome to Bulls and Cows game!");
        System.out.println("I offered a " + randomWord.length() + "-letter word, your guess?");
        //getting user word
        Scanner userWordInput = new Scanner(System.in);
        String userWord = userWordInput.next();
        new CountVowelConsonant().setUserWord(userWord);
        System.out.println(userWord);
        System.out.println(randomWord);



    }
}

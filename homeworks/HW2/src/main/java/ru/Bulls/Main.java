package ru.Bulls;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //setting file
        List A = ResourceReader.readFromResource("dictionary.txt");
        //getting random word
        String randomWord = new Words().getRandomWord();

        System.out.println("Welcome to Bulls and Cows game!");
        System.out.println("I offered a " + randomWord.length() + "-letter word, your guess?");
        System.out.println(randomWord);
        //getting user word
        Scanner userWordInput = new Scanner(System.in);
        String userWord = userWordInput.next();
        new Words().setUserWord(userWord);
        int cCount = new Counter().getsCount();
        System.out.println(cCount);
        /*int cCount = new Words().getsCount();
        int bCount = new Words().get1bCount();
        System.out.println(cCount);
        System.out.println(bCount);*/
    }
}

package ru.Bulls;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner playAgainIn = new Scanner(System.in);
        String playAgain = "N"; //default value
        do {
            //setting file
            List A = ResourceReader.readFromResource("dictionary.txt");
            //getting random word
            String randomWord = new Words().getRandomWord();

            System.out.println("Welcome to Bulls and Cows game!");
            System.out.println("I offered a " + randomWord.length() + "-letter word, your guess?");
            /*System.out.println(randomWord);*/

            //getting user word
            Scanner userWordInput = new Scanner(System.in);


            int cCount;//cows  count
            int bCount;//bulls count

            // 10 attempts
            for (int j = 0; j < 10; j++) {
                String userWord = userWordInput.next();
                while (userWord.length() != randomWord.length()){
                    System.out.println("Enter " + randomWord.length() + "-letter word");
                    userWord = userWordInput.next();
                }
                if (userWord.equals(randomWord)) {
                    System.out.println("You won!");
                    System.out.println("Wanna play again? Y/N");
                    playAgainIn.toString();
                    playAgain = playAgainIn.next();
                    break;
                } else {// counter
                    cCount = 0;
                    bCount = 0;
                    randomWord = randomWord.toLowerCase();
                    for (int n = 0; n < userWord.length(); n++) {
                        for (int i = 0; i < randomWord.length(); i++) {
                            if (userWord.charAt(n) == randomWord.charAt(i)) {
                                //Checks whether a character's position is equal
                                if (i == n) {
                                    //Increments the bulls counter
                                    bCount++;
                                }
                                //Checks whether a character's  position not equal
                                else if (i != n) {
                                    //Increments the consonant counter
                                    cCount++;
                                }
                            }
                        }
                    }
                    System.out.println("Cows: " + cCount);
                    System.out.println("Bulls: " + bCount);
                }
                if (j == 9){
                    System.out.println("You loose!");
                    System.out.println("Wanna play again? Y/N");
                    playAgainIn.toString();
                    playAgain = playAgainIn.next();
                    break;
                }
            }
        } while (playAgain.equals("Y"));
    }
}

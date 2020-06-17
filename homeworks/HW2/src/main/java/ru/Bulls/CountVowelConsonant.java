package ru.Bulls;

import java.io.IOException;
import java.util.List;
import java.util.Random;

public class CountVowelConsonant {
    int cCount;
    int bCount;

    public void main(String[] args) throws IOException {

        //Counter variable to store the count of vowels and consonant
        int cCount = 0, bCount = 0;

        Random rand = new Random(System.currentTimeMillis());
        List A = ResourceReader.readFromResource("dictionary.txt");
        //Declare a string
        String randomWord = (String) A.get(rand.nextInt(A.size()));

        //Converting entire string to lower case to reduce the comparisons
        randomWord = randomWord.toLowerCase();

        for(int i = 0; i < randomWord.length(); i++) {
            //Checks whether a character is a vowel
            if(randomWord.charAt(i) == 'a' || randomWord.charAt(i) == 'e' || randomWord.charAt(i) == 'i' || randomWord.charAt(i) == 'o' || randomWord.charAt(i) == 'u') {
                //Increments the vowel counter
                cCount++;
            }
            //Checks whether a character is a consonant
            else if(randomWord.charAt(i) >= 'a' && randomWord.charAt(i)<='z') {
                //Increments the consonant counter
                bCount++;
            }
        }
        System.out.println("Number of Cows: " + cCount);
        System.out.println("Number of Bulls: " + bCount);
        System.out.println("Word is: " + randomWord);

        /*return randomWord.length();*/
    }

}

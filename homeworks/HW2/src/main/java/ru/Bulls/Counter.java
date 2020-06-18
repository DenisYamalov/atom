package ru.Bulls;

import java.io.IOException;

public class Counter {
    int cCount;
    int bCount;
    String randomWord = new Words().getRandomWord();
    String userWord = new Words().getUserWord();

    public int getsCount() {
        return cCount;
    }
    public int get1bCount() {
        return bCount;
    }
@Override
    public Counter (/*String userWord, String randomWord*/) throws IOException {
        this.userWord = userWord;
        this.randomWord = randomWord;
   /* }*/
/*public void main(String[] args) {*/

        //Counter variable to store the count of vowels and consonant
        this.cCount = cCount = 0;
        this.bCount = bCount = 0;

        //Converting entire string to lower case to reduce the comparisons
        randomWord = randomWord.toLowerCase();
        userWord = userWord.toLowerCase();

        for (int n = 0; n < userWord.length(); n++) {
            System.out.println(userWord.charAt(n));
            for (int i = 0; i < randomWord.length(); i++) {
                System.out.println(randomWord.charAt(i));
                if (userWord.charAt(n) == randomWord.charAt(i)) {
                    /*k.add(String.valueOf(userWord.charAt(n)));*/
                    cCount++;
                    /*for (int j = 0; j < randomWord.length(); j++) {
                        //Checks whether a character is a vowel
                        if (randomWord.charAt(j) == 'a' || randomWord.charAt(j) == 'e' || randomWord.charAt(j) == 'i' || randomWord.charAt(j) == 'o' || randomWord.charAt(j) == 'u') {
                            //Increments the vowel counter
                            cCount++;
                        }
                        //Checks whether a character is a consonant
                        else if (randomWord.charAt(j) >= 'a' && randomWord.charAt(j) <= 'z') {
                            //Increments the consonant counter
                            bCount++;
                        }
                    }*/
                }
            }
       }
    }
}
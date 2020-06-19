package ru.Bulls;

import java.io.IOException;
import java.util.ArrayList;

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

    public Counter (/*String userWord, String randomWord*/) throws IOException {
        this.userWord = userWord;
        this.randomWord = randomWord;
                }
    public int main() {

        //Counter variable to store the count of vowels and consonant
        /*int cCount = 0;
        int bCount = 0;*/

       /* String randomWord = "java";
        String userWord = "lady";*/
        ArrayList k = new ArrayList();

        //Converting entire string to lower case to reduce the comparisons
        randomWord = randomWord.toLowerCase();
        userWord = userWord.toLowerCase();

        for (int n = 0; n < userWord.length(); n++) {
            for (int i = 0; i < randomWord.length(); i++) {
                if (userWord.charAt(n) == randomWord.charAt(i)) {
                    /*k.add(String.valueOf(userWord.charAt(n)));*/
                    /*for (int j = 0; j < randomWord.length(); j++) {*/
                    //Checks whether a character is a vowel
                    if (randomWord.charAt(i) == 'a' || randomWord.charAt(i) == 'e' || randomWord.charAt(i) == 'i'
                            || randomWord.charAt(i) == 'o' || randomWord.charAt(i) == 'u') {
                        //Increments the vowel counter
                        cCount++;
                    }
                    //Checks whether a character is a consonant
                    else if (randomWord.charAt(i) >= 'a' && randomWord.charAt(i) <= 'z') {
                        //Increments the consonant counter
                        bCount++;
                    }
                }
            }
        }
        System.out.println(cCount);
        System.out.println(bCount);
        return cCount & bCount;
    }
}

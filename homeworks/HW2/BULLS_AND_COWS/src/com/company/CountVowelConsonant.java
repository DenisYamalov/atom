package com.company;

/*STEP 1: START
        STEP 2: SET vCount =0, cCount =0
        STEP 3: DEFINE string str = "This is a really simple sentence".
        STEP 4: CONVERT str to lowercase
        STEP 5: SET i =0.
        STEP 6: REPEAT STEP 6 to STEP 8 UNTIL i<str.length()
        STEP 7: IF any character of str matches with any vowel then
        vCount = vCount + 1.
        STEP 8: IF any character excepting vowels lies BETWEEN a and z then
        cCount = cCount =+1.
        STEP 9: i = i + 1
        STEP 10: PRINT vCount.
        STEP 11: PRINT cCount.
        STEP 12: END
        */

public class CountVowelConsonant {
    public static void main(String[] args) {

        //Counter variable to store the count of vowels and consonant
        int vCount = 0, cCount = 0;

        //Declare a string
        String str = "Denis";

        //Converting entire string to lower case to reduce the comparisons
        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++) {
            //Checks whether a character is a vowel
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                //Increments the vowel counter
                vCount++;
            }
            //Checks whether a character is a consonant
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
                //Increments the consonant counter
                cCount++;
            }
        }
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
    }
}

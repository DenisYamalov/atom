import java.util.ArrayList;

public class Main {
    int cCount;
    int bCount;



    public static void main(String[] args) {

        //Counter variable to store the count of vowels and consonant
        int cCount = 0;
        int bCount = 0;
        String randomWord = "java";
        String userWord = "lady";
        ArrayList k = new ArrayList();

        //Converting entire string to lower case to reduce the comparisons
        randomWord = randomWord.toLowerCase();
        userWord = userWord.toLowerCase();

        for (int n = 0; n < userWord.length(); n++) {
            System.out.println(userWord.charAt(n));
            for (int i = 0; i < randomWord.length(); i++) {
                System.out.println(randomWord.charAt(i));
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
        }
    }

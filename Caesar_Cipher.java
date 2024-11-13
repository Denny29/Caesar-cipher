import java.util.Arrays;
import java.util.HashMap;

public class Caesar_Cipher {
    public static void main(String[] args) {
        System.out.println("Hello World");

        caesar("cat", 23);
        // A = 65
        // Z = 90
        // a = 97
        // z = 122
    }

    /**
     * Returns a String with each character shifted {key} times to the left
     * EX: caesar("cat", 23) will return "Zxq"
     * 
     * @param cipher The cipher to be encrypted
     * @param key    The number of times each character is shifted
     */
    public static String caesar(String cipher, int key) {
        // Make a hashmap containing what each character should be
        HashMap<Character, Character> legend = new HashMap<Character, Character>();

        // Fill the hashmap with the right keys.
        for (Character upperCase = 'A', lowerCase = 'a'; upperCase != 'Z'; upperCase++, lowerCase++) {

            int upperShift = (int) upperCase + key;
            int lowerShift = (int) lowerCase + key;

            // These if statements make sure that when the letters go "below" A or a they go
            // back to Z or z.

            if ((int) upperShift > 90) {
                upperShift -= 26;
            }

            if ((int) lowerShift > 122) {
                lowerShift -= 26;
            }

            legend.put(upperCase, (char) upperShift);
            legend.put(lowerCase, (char) lowerShift);
        }

        char[] charArray = cipher.toCharArray();
        String encryptedCipher = "";
        // Iterate over the charArray using the legend to shift it
        for (char c : charArray) {
            if (c == ' ') {
                encryptedCipher += " ";
            } else {
                encryptedCipher += legend.get(c);
            }
        }
        System.out.println(encryptedCipher);
        return null;
    }
}

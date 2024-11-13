import java.util.HashMap;
import java.util.Scanner;

public class Caesar_Cipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input the String you want encrypted: ");
        String cipher = scan.nextLine();

        System.out.println(caesar(cipher, 23));

        // A = 65
        // Z = 90
        // a = 97
        // z = 122

        scan.close();
    }

    /**
     * Returns a String with each character shifted {key} times to the right
     * EX: caesar("cat", 23) will return "Zxq"
     * 
     * @param cipher The cipher to be encrypted
     * @param key    The number of times each character is shifted
     * @return Returns the encrypted cipher
     */
    public static String caesar(String cipher, int key) {
        // Make a hashmap containing what each character should be
        HashMap<Character, Character> legend = new HashMap<Character, Character>();

        // Fill the hashmap with the right keys.
        for (Character upperCase = 'A', lowerCase = 'a'; upperCase != (char) 91; upperCase++, lowerCase++) {

            int upperShift = (int) upperCase + key;
            int lowerShift = (int) lowerCase + key;

            // If statements ensure the chars dont go over Z or z

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
        for (Character c : charArray) {
            if (!Character.isLetter(c)) {
                encryptedCipher += c;
            } else {
                encryptedCipher += legend.get(c);
            }
        }

        return encryptedCipher;
    }

    /**
     * Decrypts the encrypted cipher
     * This is done by shifting to the right (26 - original key) times... At least I
     * think
     * 
     * @param encryptedCipher The cipher encrypted using the caesar() method
     * @param shift           The number of times each character is shifted to the
     *                        right
     * @return Returns the decrypted cipher
     */
    public static String decryptCipher(String encryptedCipher, int shift) {
        return null;
    }
}

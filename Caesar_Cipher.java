import java.util.HashMap;

public class Caesar_Cipher {
    public static void main(String[] args) {
        System.out.println("Hello World");

        caesar(null, 0);
        // A = 65
        // Z = 90
        // a = 97
        // z = 122
    }

    /**
     * Returns a String with each character shifted {key} times to the left
     * EX: caesar("cat", 3) will return "Zxq"
     * 
     * @param cipher The cipher to be encrypted
     * @param key    The number of times each character is shifted
     */
    public static String caesar(String cipher, int key) {
        // Make a hashmap containing what each character should be
        HashMap<Character, Character> legend = new HashMap<Character, Character>();

        // Actually make the shift
        for (char upperCase = 'A', lowerCase = 'a'; upperCase != 'Z'; upperCase++, lowerCase++) {
            int upperShift = (int) upperCase - key;
            int lowerShift = (int) lowerCase - key;
        }
        return null;
    }
}

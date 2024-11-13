import java.util.HashMap;

public class Caesar_Cipher {
    public static void main(String[] args) {
        System.out.println("Hello World");

        caesar(null, 3);
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
        for (Character upperCase = 'A', lowerCase = 'a'; upperCase != 'Z'; upperCase++, lowerCase++) {

            int upperShift = (int) upperCase - key;
            int lowerShift = (int) lowerCase - key;

            // These if statements make sure that when the letters go "below" A or a they go
            // back to Z or z.

            if ((int) upperShift < 65) {
                upperShift += 26;
            }

            if ((int) lowerShift < 97) {
                lowerShift += 26;
            }

            legend.put(upperCase, (char) upperShift);
            legend.put(lowerCase, (char) lowerShift);
        }

        System.out.println(legend.keySet());
        System.out.println(legend.values());

        return null;
    }
}

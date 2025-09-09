package Lab2_1;

public class VernamCypher {
    private static char XOR(char a, char b) {
        return (char) (a ^ b);
    }

    public static String encrypt(String text, String key) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            char k = key.charAt(i % key.length());

            sb.append(XOR(c, k));
        }

        return sb.toString();
    }

    public static String decrypt(String text, String key) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            char k = key.charAt(i % key.length());

            sb.append(XOR(c, k));
        }

        return sb.toString();
    }

    public static void main(String args[]) {
        String key = "MY_KEY_PASSWORD";

        String valueEncrypted = encrypt("Lucas Gabriel", key);

        System.out.print("Encrypt: ");
        System.out.println(valueEncrypted);

        System.out.print("Decrypt: ");
        System.out.println(decrypt(valueEncrypted, key));
    }
}

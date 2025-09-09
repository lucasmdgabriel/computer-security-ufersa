package Lab1_0;

public class CaesarCypher {
    private int key;

    public CaesarCypher(int key) {
        this.key = key;
    }

    private char encrypt(char c) {
        if (c < 'A' || c > 'Z') {
            return c;
        }
        
        return (char) ('A' + (c - 'A' + key) % 26);
    }

    private char decrypt(char c) {
        if (c < 'A' || c > 'Z') {
            return c;
        }

        return (char) ('A' + (c - 'A' - key + 26) % 26);
    }

    public String encrypt(String text) {
        text = text.toUpperCase();
        StringBuilder sb = new StringBuilder();

        for (char c: text.toCharArray()) {
            sb.append(encrypt(c));
        }

        return sb.toString();
    }

    public String decrypt(String text) {
        text = text.toUpperCase();
        StringBuilder sb = new StringBuilder();

        for (char c: text.toCharArray()) {
            sb.append(decrypt(c));
        }

        return sb.toString();
    }
}

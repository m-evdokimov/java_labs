package src.lab2.Task3;

public class Cipher {
    private int key;
    private int alphabetLen;
    private char firstChar;

    public Cipher(int key, int alphabetLen, char firstChar) {
        this.key = key;
        this.alphabetLen = alphabetLen;
        this.firstChar = firstChar;
    }

    public String encode(String text) {
        StringBuilder encoded = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                char encodedCh = (char) (((ch - this.firstChar + this.key) % this.alphabetLen) + this.firstChar);
                encoded.append(encodedCh);
            } else {
                encoded.append(ch);
            }
        }
        return encoded.toString();
    }

    public String decode(String text) {
        StringBuilder decoded = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                char decodedCh = (char) (((ch - this.firstChar - this.key + this.alphabetLen) % this.alphabetLen) + this.firstChar);
                decoded.append(decodedCh);
            } else {
                decoded.append(ch);
            }
        }
        return decoded.toString();
    }
}

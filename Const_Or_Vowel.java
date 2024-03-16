package String_Questions;

public class Const_Or_Vowel {
    public static void main(String[] args) {
        char ch = 'a'; // replace with the character you want to check

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is a consonant");
        } else {
            System.out.println(ch + " is not a letter");
        }
    }
}

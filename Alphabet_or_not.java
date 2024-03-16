package String_Questions;

public class Alphabet_or_not {
    public static void main(String[] args) {
        char ch='u';

        if(ch>='a' || ch<='z' || ch>='A' || ch<='Z'){
            System.out.println(ch+" input is character");

        }
        else{
            System.out.println("Input is not a character");
        }
    }
}

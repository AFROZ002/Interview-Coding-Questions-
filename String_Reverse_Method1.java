package String_Questions;

public class String_Reverse_Method1 {
    public static void main(String[] args) {
        String input = "Afroz9097alam";
        String reversedString = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // Skip numbers
            while (left < right && !Character.isLetter(charArray[left])) {
                left++;
            }
            while (left < right && !Character.isLetter(charArray[right])) {
                right--;
            }

            // Swap only if both characters are letters
            if (left < right) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
            }

            left++;
            right--;
        }
        return new String(charArray);
    }
}

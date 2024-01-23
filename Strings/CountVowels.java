package Strings;


public class CountVowels {
	public static void main(String[] args) {

		String inputStr = "Hello, World!";
        int result = countVowels(inputStr);
        System.out.println("The number of vowels in '" + inputStr + "' is: " + result);
    }

    public static int countVowels(String inputString) {
        String vowels = "aeiouAEIOU";
        int count = 0;

        for (char ch : inputString.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }

        return count;
    }

}

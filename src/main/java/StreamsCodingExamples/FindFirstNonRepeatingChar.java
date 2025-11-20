package StreamsCodingExamples;

public class FindFirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "Venktta";
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.println(c);
                break;
            }
        }
    }
}


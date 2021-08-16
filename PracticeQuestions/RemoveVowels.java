import java.util.Set;

public class RemoveVowels {
    public static String removeVow(String str) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        StringBuilder sb = new StringBuilder();

        char[] charArr = str.toCharArray();

        for (char ch : charArr) {
            if (!vowels.contains(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeVow("ujjwal jamuar"));
    }
}

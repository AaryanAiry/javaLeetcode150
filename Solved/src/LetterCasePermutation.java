import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        String s = "abcd";
        LetterCasePermutation obj = new LetterCasePermutation();
        List<String> permutations = obj.LCPermutation(s);

        for (String str : permutations) {
            System.out.println(str);
        }
    }

    public List<String> LCPermutation(String s) {
        backtrack(s.toCharArray(), 0);
        return result;
    }

    private void backtrack(char[] chars, int index) {
        if (index == chars.length) { // leaf node
            result.add(new String(chars));
            return; // stop current branch from going any deeper
        }

        // branch without changing
        backtrack(chars, index + 1);

        // branch with changing case (if it's a letter)
        if (Character.isLetter(chars[index])) {
            chars[index] = Character.isUpperCase(chars[index])
                    ? Character.toLowerCase(chars[index])
                    : Character.toUpperCase(chars[index]);
            backtrack(chars, index + 1);

            // backtrack (undo the change)
            chars[index] = Character.isUpperCase(chars[index])
                    ? Character.toLowerCase(chars[index])
                    : Character.toUpperCase(chars[index]);
        }
    }
}

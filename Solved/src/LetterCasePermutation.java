import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    List<String> result = new ArrayList<>();
    private static void main(String args[]){
        String s = "abcd";
        LCPermutation(s);
    }
    private List<String> LCPermutation(String s){
        backtrack(s,0);
        return result;
    }
    private void backtrack(char[] chars, int index){
        if(index==chars.length){ //leaf node
            result.add(new String(chars));
            return; //stop current branch from going any deeper
        }

        backtrack(chars,index+1);
        if(Character.isLetter(chars(index))){
            chars[index] = Character.isUpperCase(chars[index])? Character.toLowerCase(chars[index]):Character.toUpperCase(chars[index]);
            backtrack(chars,index+1);

        }
    }

}

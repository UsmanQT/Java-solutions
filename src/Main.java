//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String word1 = "abc";
        String word2 = "pqrs";
        String result = solution.mergeAlternately(word1, word2);
        System.out.println(result);  // Output: a1b2c3456
    }
}
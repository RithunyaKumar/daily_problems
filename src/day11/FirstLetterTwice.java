package day11;
public class FirstLetterTwice {

    public char repeatedCharacter(String s) {

        boolean[] visited = new boolean[26];

        for (char ch : s.toCharArray()) {

            if (visited[ch - 'a']) {
                return ch;
            }

            visited[ch - 'a'] = true;
        }

        return ' ';
    }

    public static void main(String[] args) {

        FirstLetterTwice obj = new FirstLetterTwice();

        System.out.println(obj.repeatedCharacter("abccbaacz"));
    }
}
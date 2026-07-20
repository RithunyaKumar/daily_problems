package day14;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Occurance {

    public static void main(String[] args) {

        String[] words = {"Apple", "Banana", "Apple", "Mango", "Banana", "Apple"};

        Map<String, Long> count = Arrays.stream(words)
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ));

        System.out.println(count);
    }
}
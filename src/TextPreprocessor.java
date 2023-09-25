import java.util.Arrays;
import java.util.List;

public class TextPreprocessor {
    public static List<String> tokenize(String text) {
        text = text.toLowerCase().replaceAll("[^a-z ]", "");
        String[] tokens = text.split("\\s+");
        return Arrays.asList(tokens);
    }
}

import java.util.ArrayList;
import java.util.List;

public class NGramGenerator {
    public static List<String> generateNGrams(List<String> tokens, int n) {
        List<String> ngrams = new ArrayList<>();
        for (int i = 0; i < tokens.size() - n + 1; i++) {
            StringBuilder ngram = new StringBuilder();
            for (int j = i; j < i + n; j++) {
                if (j > i) {
                    ngram.append(" ");
                }
                ngram.append(tokens.get(j));
            }
            ngrams.add(ngram.toString());
        }
        return ngrams;
    }
}

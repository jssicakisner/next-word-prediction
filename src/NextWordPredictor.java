import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class NextWordPredictor {
    private Map<String, Map<String, Integer>> ngramModel;

    public NextWordPredictor() {
        ngramModel = new HashMap<>();
    }

    public void train(List<String> ngrams) {
        for (String ngram : ngrams) {
            String[] parts = ngram.split(" ");
            if (parts.length != 2) {
                continue;
            }
            String prefix = parts[0];
            String nextWord = parts[1];

            ngramModel.computeIfAbsent(prefix, k -> new HashMap<>());
            Map<String, Integer> nextWordFreqs = ngramModel.get(prefix);
            nextWordFreqs.put(nextWord, nextWordFreqs.getOrDefault(nextWord, 0) + 1);
        }
    }

    public String predictNextWord(String prefix) {
        Map<String, Integer> nextWordFreqs = ngramModel.getOrDefault(prefix, new HashMap<>());
        if (nextWordFreqs.isEmpty()) {
            return null;
        }

        int totalFrequency = nextWordFreqs.values().stream().mapToInt(Integer::intValue).sum();
        int rand = new Random().nextInt(totalFrequency);

        for (Map.Entry<String, Integer> entry : nextWordFreqs.entrySet()) {
            rand -= entry.getValue();
            if (rand <= 0) {
                return entry.getKey();
            }
        }

        return null;
    }
}

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "The mutineers pursued the ship, as soon as they discovered she was underway, but, finding that she outsailed them, they soon gave up the chase, and returned to the shore. The nautical instruments of every description had been taken on shore by order of the mutineers, so that the people on board of the Globe were left to traverse a vast ocean, studded with islands, and rocks, and reefs, where currents are frequent, strong, and variable, without any other guide by which to direct their course than the stars and prevailing winds.";
        List<String> tokens = TextPreprocessor.tokenize(text);
        List<String> bigrams = NGramGenerator.generateNGrams(tokens, 2);
    
        NextWordPredictor predictor = new NextWordPredictor();
        predictor.train(bigrams);
    
        String prefix = "they";
        String nextWord = predictor.predictNextWord(prefix);
        System.out.println("Predicted next word: " + nextWord);
    }
}

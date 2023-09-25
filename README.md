# Text Prediction Java Program

This is a simple Java program that demonstrates how to use a text prediction model to predict the next word given a prefix. The program uses bigrams (pairs of adjacent words) to generate predictions.
This project uses built in libraries for preprocessing (cleaning and tokenizing) the text data.
An n-gram was used to vreate a contiguous sequence of n items from a given sample of text and then the `NextWordPredictor` class uses a simple frequency-based model to predict the next word based on the given n-gram.

## Getting Started

To run this program, you will need to have Java installed on your computer. You can download the latest version of Java from the [official website](https://www.java.com/en/download/).

Once you have Java installed, you can compile and run the program using the following commands:

```
javac Main.java
java Main
```

This will compile the `Main.java` file and run the program.

## Usage

The program is designed to predict the next word given a prefix. To change the prefix, you can modify the `prefix` variable in the `main` method of the `Main` class.

You can also modify the sample text used to train the model by changing the `text` variable in the `main` method.
The text used in the `main` method was extrated from the book **Journal of a cruise of the United States Schooner Dolphin**.

## Contributing

If you'd like to contribute to this project, please fork the repository and submit a pull request.

## License

This project is licensed under the MIT License.
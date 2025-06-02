import java.util.Arrays;

public class WordCounter {

    public int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        return text.trim().split("\\s+").length;
    }

    public int countCharacters(String text) {
        if (text == null) {
            return 0;
        }
        return text.length();
    }

    public int countParagraphs(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        // Split by one or more newline characters and filter out empty strings
        return (int) Arrays.stream(text.split("\\n+"))
                .filter(paragraph -> !paragraph.trim().isEmpty())
                .count();
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {

    private final WordCounter wordCounter = new WordCounter();

    @Test
    void countWords_shouldReturnZeroForNullInput() {
        assertEquals(0, wordCounter.countWords(null));
    }

    @Test
    void countWords_shouldReturnZeroForEmptyString() {
        assertEquals(0, wordCounter.countWords(""));
    }

    @Test
    void countWords_shouldReturnZeroForWhitespaceOnly() {
        assertEquals(0, wordCounter.countWords("   "));
    }

    @Test
    void countWords_shouldCountSingleWord() {
        assertEquals(1, wordCounter.countWords("Hello"));
    }

    @Test
    void countWords_shouldCountMultipleWords() {
        assertEquals(4, wordCounter.countWords("This is a test"));
    }

    @Test
    void countWords_shouldHandleMultipleSpaces() {
        assertEquals(3, wordCounter.countWords("Multiple   spaces   between"));
    }

    @Test
    void countCharacters_shouldReturnZeroForNullInput() {
        assertEquals(0, wordCounter.countCharacters(null));
    }

    @Test
    void countCharacters_shouldReturnZeroForEmptyString() {
        assertEquals(0, wordCounter.countCharacters(""));
    }

    @Test
    void countCharacters_shouldCountCharactersIncludingSpaces() {
        assertEquals(11, wordCounter.countCharacters("Hello world"));
    }

    @Test
    void countCharacters_shouldCountSpecialCharacters() {
        assertEquals(6, wordCounter.countCharacters("@#$%^&"));
    }

    @Test
    void countParagraphs_shouldReturnZeroForNullInput() {
        assertEquals(0, wordCounter.countParagraphs(null));
    }

    @Test
    void countParagraphs_shouldReturnZeroForEmptyString() {
        assertEquals(0, wordCounter.countParagraphs(""));
    }

    @Test
    void countParagraphs_shouldReturnOneForSingleParagraph() {
        assertEquals(1, wordCounter.countParagraphs("Single paragraph"));
    }

    @Test
    void countParagraphs_shouldCountMultipleParagraphs() {
        String text = "First paragraph\n\nSecond paragraph\nThird paragraph";
        assertEquals(3, wordCounter.countParagraphs(text));
    }

    @Test
    void countParagraphs_shouldIgnoreEmptyParagraphs() {
        String text = "\n\nFirst\n\n\nSecond\n\n";
        assertEquals(2, wordCounter.countParagraphs(text));
    }

    @Test
    void countParagraphs_shouldHandleWindowsLineEndings() {
        String text = "First\r\n\r\nSecond\r\nThird";
        assertEquals(3, wordCounter.countParagraphs(text));
    }
}
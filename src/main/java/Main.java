public class Main {
    public static void main(String[] args) {
        WordCounter counter = new WordCounter();
        String sampleText = "Hello world!\n\nThis is a test.\nThird paragraph.";

        System.out.println("Word count: " + counter.countWords(sampleText));
        System.out.println("Character count: " + counter.countCharacters(sampleText));
        System.out.println("Paragraph count: " + counter.countParagraphs(sampleText));
    }
}

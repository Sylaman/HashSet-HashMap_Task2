import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class WordsChecker {

    protected String text;
    String[] words;
    Set<String> set;

    public WordsChecker(String text) {
        this.text = text;
        this.words = getText().split("\\P{IsAlphabetic}+");
        this.set = new HashSet<>();
        Collections.addAll(set, words);
    }

    public boolean hasWord(String word) {
        return set.contains(word);
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordsChecker that = (WordsChecker) o;
        return Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
}

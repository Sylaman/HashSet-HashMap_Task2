import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class WordsChecker {

    protected String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        String[] words = getText().split("\\P{IsAlphabetic}+");
        Set<String> set = new HashSet<>();
        Collections.addAll(set, words);
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

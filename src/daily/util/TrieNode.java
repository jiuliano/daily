package daily.util;

/**
 * Created by james on 1/19/2017.
 */
public class TrieNode {
    public TrieNode children[];
    public String word;

    public TrieNode() {
        word = null;
        children = new TrieNode[256];
    }

    public TrieNode(String word) {
        this();
        this.word = word;
    }

    public String getWord() {
        return word;
    }
}

package ds.trees;

import java.util.LinkedList;

/**
 * Created by skupunarapu on 12/16/2015.
 */
public class Trie {
    private TrieNode root;

    /* Constructor */
    public Trie()
    {
        root = new TrieNode(' ');
    }
    /* Function to insert word */
    public void insert(String word)
    {
        if (search(word) == true)
            return;
        TrieNode current = root;
        for (char ch : word.toCharArray() )
        {
            TrieNode child = current.subNode(ch);
            if (child != null)
                current = child;
            else
            {
                current.childList.add(new TrieNode(ch));
                current = current.subNode(ch);
            }
            current.count++;
        }
        current.isEnd = true;
    }
    /* Function to search for word */
    public boolean search(String word)
    {
        TrieNode current = root;
        for (char ch : word.toCharArray() )
        {
            if (current.subNode(ch) == null)
                return false;
            else
                current = current.subNode(ch);
        }
        if (current.isEnd == true)
            return true;
        return false;
    }
    /* Function to remove a word */
    public void remove(String word)
    {
        if (search(word) == false)
        {
            System.out.println(word +" does not exist in trie\n");
            return;
        }
        TrieNode current = root;
        for (char ch : word.toCharArray())
        {
            TrieNode child = current.subNode(ch);
            if (child.count == 1)
            {
                current.childList.remove(child);
                return;
            }
            else
            {
                child.count--;
                current = child;
            }
        }
        current.isEnd = false;
    }
}

class TrieNode
{
    char content;
    boolean isEnd;
    int count;
    LinkedList<TrieNode> childList;

    /* Constructor */
    public TrieNode(char c)
    {
        childList = new LinkedList<TrieNode>();
        isEnd = false;
        content = c;
        count = 0;
    }
    public TrieNode subNode(char c)
    {
        if (childList != null)
            for (TrieNode eachChild : childList)
                if (eachChild.content == c)
                    return eachChild;
        return null;
    }
}

class TestTrie{
    public static void main(String[] args) {
        Trie t = new Trie();
        System.out.println("Trie Test\n");

        t.insert("trie");
        t.insert("tree");
        t.insert("branch");
        t.insert("beach");

        System.out.println(t.search("bean"));
        System.out.println(t.search("beach"));



        t.remove("bean");
        t.remove("beach");
        System.out.println();

    }
}
package Trie;

public class Trie {

    private TrieNode root;

    public Trie(){
        root = new TrieNode();    // root is empty.
    }

    private class TrieNode{
        private TrieNode[] chidren;
        private boolean isWord;

        public TrieNode(){
            this.chidren = new TrieNode[26];         // storing alphabets
            this.isWord = false;
        }
    }

    public void insert(String word) {
        if (word == null || word.isEmpty()){
            throw new IllegalArgumentException("Invalid Input");
        }

        word = word.toLowerCase();

        TrieNode current = root;
        int n = word.length();
        for (int i = 0; i < n; i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (current.chidren[index] == null) {
                TrieNode node = new TrieNode();
                current.chidren[index] = node;
                current = node;
            }
            else{
                current = current.chidren[index];
            }
        }

        current.isWord = true;
            
        }

    public boolean search(String word) {        return false;
    }
    public static void main(String[] args) {
        Trie tr = new Trie();
        tr.insert("son");
        tr.insert("so");
        tr.insert("cat");
        tr.insert("cab");

        System.out.println("Inserted Successfully");
    }
}

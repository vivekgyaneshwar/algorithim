package challenges.interviews;

class Trie {

    static final int asize=26;

    class TrieNode {
        TrieNode[] children;
        boolean eow;

        TrieNode() {
            this.children = new TrieNode[26];
            this.eow = false;
        }
    }

    private TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }


    /** Inserts a word into the trie. */
    public void insert(String word) {
        int level;
        int length=word.length();
        int index;
        TrieNode pcrawl=root;

        for(level=0;level<length;level++)
        {
            index=word.charAt(level)-'a';
            if(pcrawl.children[index]==null)
                pcrawl.children[index]=new TrieNode();
            pcrawl=pcrawl.children[index];

        }
        pcrawl.eow=true;


    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {

        int level;
        int length=word.length();
        int index;
        TrieNode pcrawl=root;

        for (level=0;level<length;level++)
        {
            index=word.charAt(level)-'a';
            if(pcrawl.children[index]==null)
                return false;
            pcrawl=pcrawl.children[index];
        }
        return (pcrawl!=null && pcrawl.eow);

    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        int level;
        int length=prefix.length();
        int index;
        TrieNode pcrawl=root;

        for (level=0;level<length;level++)
        {
            index=prefix.charAt(level)-'a';
            if(pcrawl.children[index]==null)
                return false;
            pcrawl=pcrawl.children[index];
        }
        return (pcrawl!=null);
    }

    public  void printTrie(){
        TrieNode pcrawl=root;
        while (pcrawl!=null){
            System.out.println(pcrawl.children.length);
            if(pcrawl.children[0]==null)
                pcrawl=pcrawl.children[0];
        }
    }

}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

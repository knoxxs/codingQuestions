import java.util.*;

public class test {
    
    public static void main(String[] args){
        test a = new test();
        System.out.println(a.wordBreak("acaaaaabbbdbcccdcdaadcdccacbcccabbbbcdaaaaaadb", new HashSet<String>(Arrays.asList("abbcbda","cbdaaa","b","dadaaad","dccbbbc","dccadd","ccbdbc","bbca","bacbcdd","a","bacb","cbc","adc","c","cbdbcad","cdbab","db","abbcdbd","bcb","bbdab","aa","bcadb","bacbcb","ca","dbdabdb","ccd","acbb","bdc","acbccd","d","cccdcda","dcbd","cbccacd","ac","cca","aaddc","dccac","ccdc","bbbbcda","ba","adbcadb","dca","abd","bdbb","ddadbad","badb","ab","aaaaa","acba","abbb"))));
        // System.out.println(a.wordBreak("leetcode", new HashSet<String>(Arrays.asList("leet", "code"))));
    }

    public boolean wordBreak(String s, Set<String> dict) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(s.length() == 0){
            return true;
        }
        for (int i=s.length(); i>0; i--){
            if(dict.contains(s.substring(0,i))){
                if(wordBreak(s.substring(i), dict)){
                    return true;
                }
            }
        }
        return false;
    }
}
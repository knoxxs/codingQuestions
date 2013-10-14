import java.util.*;

public class test {
    
    public static void main(String[] args){
        test a = new test();
        // System.out.println(a.wordBreak("acaaaaabbbdbcccdcdaadcdccacbcccabbbbcdaaaaaadb", new HashSet<String>(Arrays.asList("abbcbda","cbdaaa","b","dadaaad","dccbbbc","dccadd","ccbdbc","bbca","bacbcdd","a","bacb","cbc","adc","c","cbdbcad","cdbab","db","abbcdbd","bcb","bbdab","aa","bcadb","bacbcb","ca","dbdabdb","ccd","acbb","bdc","acbccd","d","cccdcda","dcbd","cbccacd","ac","cca","aaddc","dccac","ccdc","bbbbcda","ba","adbcadb","dca","abd","bdbb","ddadbad","badb","ab","aaaaa","acba","abbb"))));
        System.out.println(a.wordBreak("leetcode", new HashSet<String>(Arrays.asList("leet", "code"))));
    }

    public boolean wordBreak(String s, Set<String> dict) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int[][] mem = new int[s.length()][s.length()+1];
        return wordBreak(s, dict, mem, 0, s.length()-1);
    }

    private boolean wordBreak(String s, Set<String> dict, int[][] mem, int start, int end){
        if(s.length() == 0){
            return true;
        }
        int current = end+1;
        while(current >= start){
            if(mem[start][current] == 0){
                if(dict.contains(s.substring(start,current))){
                    mem[start][current] = 1;
                    if(end+1 == current){
                        return true;
                    }else{
                        return wordBreak(s, dict, mem, current, end);
                    }
                }
            }else if(mem[start][current] == 1){
                return true;
            }else{
                return false;
            }
            current--;
        }
        return false;
    }
}
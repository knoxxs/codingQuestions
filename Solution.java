public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(s == ""){
            return true;
        }
        for (int i=1; i<=s.length(); i++){
            if(dict.contains(s.substring(0,i))){
                if(wordBreak(s.substring(i), dict)){
                    return true;
                }
            }
        }
        return false;
    }
}
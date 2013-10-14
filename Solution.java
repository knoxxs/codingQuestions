public class Solution {
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
public class Solution {
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
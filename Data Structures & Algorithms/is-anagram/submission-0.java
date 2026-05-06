class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();

        if(s.length() != t.length())
            return false;
        
        int n = s.length();

        for(char c: s.toCharArray()) {
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);        
        }

        for(char c: t.toCharArray()) {
            if(!sMap.containsKey(c)) {
                return false;
            }
            sMap.put(c, sMap.get(c) - 1);
        }

        for(int val: sMap.values()){
            if(val != 0)
                return false;
        }

        return true;
    }
}
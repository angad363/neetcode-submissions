class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        Map<Character, Integer> charMap = new HashMap<>();
        int n = s.length();

        for(char sChar : s.toCharArray()) {
            charMap.put(sChar, charMap.getOrDefault(sChar, 0) + 1);
        }

        for(char tChar : t.toCharArray()) {
            if(!charMap.containsKey(tChar))
                return false;
            
            charMap.put(tChar, charMap.get(tChar) - 1);
            if(charMap.get(tChar) == 0)
                charMap.remove(tChar);
        }

        if(charMap.isEmpty())
            return true;

        return false;
    }
}

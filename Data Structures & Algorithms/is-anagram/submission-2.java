// Solution 1:
// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length() != t.length())
//             return false;
        
//         Map<Character, Integer> charMap = new HashMap<>();
//         int n = s.length();

//         for(char sChar : s.toCharArray()) {
//             charMap.put(sChar, charMap.getOrDefault(sChar, 0) + 1);
//         }

//         for(char tChar : t.toCharArray()) {
//             if(!charMap.containsKey(tChar))
//                 return false;
            
//             charMap.put(tChar, charMap.get(tChar) - 1);
//             if(charMap.get(tChar) == 0)
//                 charMap.remove(tChar);
//         }

//         if(charMap.isEmpty())
//             return true;

//         return false;
//     }
// }

// Solution 2:
class Solution {
    boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] count = new int[26];
        Arrays.fill(count, 0);

        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int frequency : count){
            if(frequency != 0)
                return false;
        }

        return true;
    }
}
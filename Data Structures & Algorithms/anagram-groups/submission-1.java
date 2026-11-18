class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(String str: strs) {
            int[] count = new int[26];
            Arrays.fill(count, 0);
            for(int i = 0; i < str.length(); i++) {
                count[str.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(count);

            if(!anagramMap.containsKey(key)) {
                anagramMap.put(key, new ArrayList<>());
            }
            
            anagramMap.get(key).add(str);
        }

        for(List<String> value: anagramMap.values()) {
            result.add(value);
        }

        return result;

    }
}

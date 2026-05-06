class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> strMap = new HashMap<>();

        for(String s: strs) {
            int[] count = new int[26];
            Arrays.fill(count, 0);

            for(char c: s.toCharArray()) {
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);

            strMap.putIfAbsent(key, new ArrayList<>());
            strMap.get(key).add(s);
        }

        return new ArrayList<>(strMap.values());
    }
}
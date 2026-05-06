class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder s = new StringBuilder();
        String first = strs[0];
        String last = strs[strs.length - 1];

        for(int  i = 0; i < Math.min(first.length(), last.length()); i++) {
            if(first.charAt(i) != last.charAt(i)) {
                break;
            }
            s.append(first.charAt(i));
        }

        if(s.isEmpty())
            return "";
        else
            return s.toString();
    }
}
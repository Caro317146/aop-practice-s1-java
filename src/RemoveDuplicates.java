class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        int sbLength = 0;
        for (char c : s.toCharArray()) {
            if (sbLength > 0 && sb.charAt(sbLength - 1) == c) {
                sb.deleteCharAt(sbLength - 1);
                sbLength--;
            } else {
                sb.append(c);
                sbLength++;
            }
            
        }
        return sb.toString();     
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        String newString = s.replaceAll("[^A-Za-z0-9]", "");
        char[] ch = newString.trim().toLowerCase().toCharArray();
        int n = ch.length;
        if(n == 0) return true;
        for (int i = 0; i < n/2 + 1; i++) {
            if (ch[i] != ch[n - i - 1]) {
                return false;
            }
        }
        return true;
    }
}

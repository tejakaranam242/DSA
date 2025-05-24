class Solution {
    public static int sumSubstrings(String s) {
        // code here
        int sum = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            String sub = "";
            for (int j = i; j < n; j++) {
                sub += s.charAt(j);
                sum += Integer.parseInt(sub);
            }
        }

        return sum;
    }
}

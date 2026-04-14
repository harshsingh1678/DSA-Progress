// using freq array instead hashmap (most optimal solution)
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int i = 0;
        int j = 0;
        int k = p.length();
        int count = k;

        List<Integer> ans = new ArrayList<>();
        int[] freq = new int[26];

        // Build frequency array
        // store freq of every element of p
        for (int c : p.toCharArray()) {
            freq[c - 'a']++;
        }

        while (j < s.length()) {
            if (freq[s.charAt(j) - 'a'] > 0)
                count--;
            freq[s.charAt(j) - 'a']--;

            if (j - i + 1 < k)
                j++;

            else if (j - i + 1 == k) {
                if (count == 0)
                    ans.add(i);

                if (freq[s.charAt(i) - 'a'] >= 0)
                    count++;

                freq[s.charAt(i) - 'a']++;
                i++;
                j++;
            }
        }
        return ans;
    }
}
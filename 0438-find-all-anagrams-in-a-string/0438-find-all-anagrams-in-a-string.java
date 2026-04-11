class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int i = 0;
        int j = 0;
        int k = p.length();

        List<Integer> list = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();

        // Build frequency map
        for (int m = 0; m < p.length(); m++) {
            map.put(p.charAt(m), map.getOrDefault(p.charAt(m), 0) + 1);
        }

        int count = map.size();

        while (j < s.length()) {
            if (map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                if (map.get(s.charAt(j)) == 0)
                    count--;
            }

            if (j - i + 1 < k)
                j++;

            else if (j - i + 1 == k) {
                if (count == 0)
                    list.add(i);

                if (map.containsKey(s.charAt(i))) {
                    if (map.get(s.charAt(i)) == 0)
                        count++;

                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                }
                i++;
                j++;
            }
        }
        return list;
    }
}
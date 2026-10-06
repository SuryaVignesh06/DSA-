import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> h = new HashMap<>();

        for(String str: strs){
            int[] count = new int[26];
            for(char c : str.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < 26;i++){
                sb.append('#').append(count[i]);
            }
            String key = sb.toString();

            h.computeIfAbsent(key, k -> new ArrayList()).add(str);
        }
        return new ArrayList<>(h.values());

    }
}
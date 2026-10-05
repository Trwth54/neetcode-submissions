class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> mainList = new ArrayList<>();
        
        for (int i = 0; i < strs.length; i++)
        {
            if (strs[i] == null)
                continue; // if entry is null, skip
            
            List<String> subList = new ArrayList<>();
            
            subList.add(strs[i]);

            for (int j = i + 1; j < strs.length; j++)
            {
                if (strs[j] == null)
                    continue; // if entry is null, skip
                
                if(isAnagram(strs[i], strs[j]))
                {
                    subList.add(strs[j]);
                    strs[j] = null; // make null to not reuse indices
                }
            }

            mainList.add(subList); // adds sublist to list
            strs[i] = null; // make null to not reuse indices
        }

        return mainList;
    }

    public boolean isAnagram(String s, String t) {
        
        int[] count = new int[26];

        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++)
        {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int j = 0; j < count.length; j++)
        {
            if (count[j] != 0)
                return false;
        }

        return true;
    }
}

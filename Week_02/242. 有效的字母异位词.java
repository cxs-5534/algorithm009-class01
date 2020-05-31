//Solution1
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        int[] alpha_table = new int[26];

        for (int i = 0; i < s.length(); i++) 
        {
            alpha_table[s.charAt(i) - 'a']++;
        }
        //return Arrays.stream(alpha_table).noneMatch(num -> num != 0);
        for (int i = 0; i <  s.length(); i++)
        {
            alpha_table[t.charAt(i) - 'a']--;
            if(alpha_table[t.charAt(i) - 'a'] < 0)
            {
                return false;
            }
        }
        return true;
    }
}

//solution2
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1,str2);
    }
}

//solution3
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) 
        {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter)
        {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
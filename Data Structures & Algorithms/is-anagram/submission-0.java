class Solution {
    public boolean isAnagram(String s, String t)
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Integer> h1=new HasHMap<>();
        HashMap<Character,Integer> h2=new HasHMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<t.length();i++)
        {
            char ch=s.charAt(i);
            h2.put(ch,h1.getOrDefault(ch,0)+1);
        }


    }
}

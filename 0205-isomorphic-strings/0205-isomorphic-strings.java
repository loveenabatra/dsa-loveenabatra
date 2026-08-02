class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> charidxs=new HashMap<>();
        HashMap<Character,Integer> charidxt=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!charidxs.containsKey(s.charAt(i))){
                charidxs.put(s.charAt(i),i);
            }
            if(!charidxt.containsKey(t.charAt(i))){
                charidxt.put(t.charAt(i),i);
            }
            if(!charidxs.get(s.charAt(i)).equals(charidxt.get(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}
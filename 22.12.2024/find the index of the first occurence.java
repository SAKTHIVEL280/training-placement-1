class Solution {
    public int strStr(String a, String n) {
        for(int i = 0, j = n.length(); j<=a.length(); i++,j++){
            if(a.substring(i,j).equals(n)){
                return i;
            }
        }
        return -1;
    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        int index = 0;
        for(int i = s.length() - 1; i > 0; i--){
            if(s.charAt(i) != ' ' && s.charAt(i - 1) == ' ' ){
                index = i;
                break;
            }
        }
        return s.substring(index).trim().length();
    }
}
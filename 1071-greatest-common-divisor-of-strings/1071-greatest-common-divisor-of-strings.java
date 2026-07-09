class Solution {
    public String gcdOfStrings(String str1, String str2) {
        //to make str2 always smaller then str1
        if(str2.length() > str1.length()){
            return gcdOfStrings(str2, str1);
        }
        //to check if both strings are equal
        if(str2.equals(str1)){
            return str1;
        }
        //to check if str1 starts with str2 and shorten str1
        if(str1.startsWith(str2)){
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
        return"";
    }
}
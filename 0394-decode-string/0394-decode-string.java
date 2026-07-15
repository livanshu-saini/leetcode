class Solution {
    public String decodeString(String s) {
        Stack <Integer> countStack = new Stack<>();
        Stack <String> stringStack = new Stack<>();
        int count = 0;
        String curr = "";

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                count = count * 10 + (c - '0'); //(c - '0') is a quick trick to convert a character digit into its actual integer value.
            }
            else if(c == '['){
                countStack.push(count);
                stringStack.push(curr);
                count = 0;
                curr = "";
            }
            else if(c == ']'){
                StringBuilder sb = new StringBuilder(stringStack.pop());
                int repeat = countStack.pop();
                for(int i = 1; i <= repeat; i++){
                    sb.append(curr);
                }
                curr = sb.toString();
            }
            else{
                curr += c;
            }
        }
        return curr;

    }
}

// for explanation refer to this video - https://www.youtube.com/watch?v=OywFKNgIHDk
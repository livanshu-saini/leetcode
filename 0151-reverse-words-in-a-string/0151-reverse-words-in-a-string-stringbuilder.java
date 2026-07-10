class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" +");
        Stack<String> stack = new Stack<>();

        for(String word : words){
            stack.push(word);
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
class Solution {
    public boolean isValid(String s) {
        if(s.length()==1) return false;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}'){
                if(stack.isEmpty()) return false;
                char c=s.charAt(i);
                if(c==')' && stack.peek()!='(' || c=='}' && stack.peek()!='{' || c==']' && stack.peek()!='['){
                    return false;
                }
                stack.pop();
            }
            else
                stack.push(s.charAt(i));
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}

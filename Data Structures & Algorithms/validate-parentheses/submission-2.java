class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
                if(c=='(' || c=='{' ||c=='['){
                    stack.push(c);
                }
                else{
                    if(stack.isEmpty() || !validmatch(stack.peek(),c)){
                        return false;
                    }
                    stack.pop();
                }
        }
        return stack.isEmpty();
    }
    private static boolean validmatch(char open,char close){
        return (open=='(' && close==')') || (open=='{' && close=='}') || (open=='[' && close==']');
    }
}
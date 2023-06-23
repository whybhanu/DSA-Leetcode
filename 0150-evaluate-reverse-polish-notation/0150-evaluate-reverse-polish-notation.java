class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            String x = tokens[i];
            if(x.equals("+") || x.equals("-") || x.equals("*") || x.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                if(x.equals("+")) stack.push(a + b);
                else if(x.equals("-")) stack.push( b - a);
                else if(x.equals("*")) stack.push(b * a);
                else if(x.equals("/")) stack.push(b / a);
            } else{
                String s = tokens[i];
                int p = Integer.parseInt(s);
                stack.push(p);
            }
        }
        return stack.peek();
    }
}
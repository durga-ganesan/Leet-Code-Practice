class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for (String str : tokens) {
            if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
                Integer val2 = stk.pop();
                Integer val1 = stk.pop();
                if (str.equals("+")) {
                    stk.push(val1 + val2);
                } else if (str.equals("-")) {
                    stk.push(val1 - val2);
                } else if (str.equals("*")) {
                    stk.push(val1 * val2);
                } else {
                    stk.push(val1 / val2);
                }
            } else {
                stk.push(Integer.valueOf(str));
            }
        }
        if(stk.isEmpty()) return 0;
        return stk.pop();
    }
}

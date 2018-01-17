import java.util.Stack;

/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.

 Valid operators are +, -, *, /. Each operand may be an integer or another expression.

 Some examples:
 ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6

 */
public class Leet_150 {
	public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();
		for(int i =0;i<tokens.length;i++){
			if(!isOp(tokens[i])) stack.add(Integer.valueOf(tokens[i]));
			else{
				int right = stack.pop();
				int left = stack.pop();
				stack.add(op(left,right,tokens[i].charAt(0)));
			}
		}
		return stack.pop();
	}
	public boolean isOp(String op){
		if(op.equals("+")||op.equals("-")||op.equals("*")||op.equals("/"))	return true;
		else return false;
	}
	public int op(int left,int right,char op){
		switch (op){
			case '+':
				return left+right;
			case '-':
				return left-right;
			case '*':
				return left*right;
			case '/':
				return left/right;
			default:
				return 0;
		}
	}
	public static void main(String args[]){
		String []tokens ={"4","13","5","/","+"};
		System.out.println(new Leet_150().evalRPN(tokens));
	}
}

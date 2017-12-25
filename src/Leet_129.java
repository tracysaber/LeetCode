/**
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

 An example is the root-to-leaf path 1->2->3 which represents the number 123.

 Find the total sum of all root-to-leaf numbers.

 For example,

 1
 / \
 2   3
 The root-to-leaf path 1->2 represents the number 12.
 The root-to-leaf path 1->3 represents the number 13.

 Return the sum = 12 + 13 = 25.
 */
public class Leet_129 {
	public int sum = 0;
	public int sumNumbers(TreeNode root) {
		addNums(root,0);
		return sum;
	}
	public void addNums(TreeNode node,int num){
		if(node==null)	return;
		else{
			num = num *10 + node.val;
			if(node.left==null&&node.right==null) sum+=num;
			else{
				addNums(node.left,num);
				addNums(node.right,num);
			}
		}
	}
	public static void main(String args[]){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(5);
		root.right = new TreeNode(3);
		System.out.println(new Leet_129().sumNumbers(root));
	}
}

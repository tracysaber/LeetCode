import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * There are a total of n courses you have to take, labeled from 0 to n-1.

 Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]

 Given the total number of courses and a list of prerequisite pairs, return the ordering of courses you should take to finish all courses.

 There may be multiple correct orders, you just need to return one of them. If it is impossible to finish all courses, return an empty array.

 Example 1:

 Input: 2, [[1,0]]
 Output: [0,1]
 Explanation: There are a total of 2 courses to take. To take course 1 you should have finished
 course 0. So the correct course order is [0,1] .
 Example 2:

 Input: 4, [[1,0],[2,0],[3,1],[3,2]]
 Output: [0,1,2,3] or [0,2,1,3]
 Explanation: There are a total of 4 courses to take. To take course 3 you should have finished both
 courses 1 and 2. Both courses 1 and 2 should be taken after you finished course 0.
 So one correct course order is [0,1,2,3]. Another correct ordering is [0,2,1,3] .
 */
class PathNode{
	Set<Integer> pre;
	Set<Integer> next;
	boolean hasNopre;
	boolean isFinished;
	public PathNode(){
		this.pre=new HashSet<Integer>();
		this.next=new HashSet<Integer>();
		this.isFinished = false;
		this.hasNopre = true;
	}
}
public class Leet_210 {

	public int[] findOrder(int numCourses, int[][] prerequisites) {
		PathNode nodes[] = new PathNode[numCourses];
		for(int i=0;i<numCourses;i++){
			nodes[i]= new PathNode();
		}
		for(int i=0;i<prerequisites.length;i++){
			nodes[prerequisites[i][0]].pre.add(prerequisites[i][1]);
			nodes[prerequisites[i][0]].hasNopre=false;
			nodes[prerequisites[i][1]].next.add(prerequisites[i][0]);
		}
		boolean flag = true;
		int results []= new int[numCourses];
		int index=0;
		while(flag){
			flag= false;
			for(int i=0;i<numCourses;i++){
				if(!nodes[i].isFinished&&nodes[i].pre.isEmpty()){
					results[index++]=i;
					nodes[i].isFinished=true;
					for(Integer c:nodes[i].next){
						nodes[c].pre.remove(i);
					}
					flag = true;
				}
			}
		}
		if(index==numCourses)	return results;
		else return new int[0];
	}
	public static void main(String args[]){
		int pre[][]={{1,0},{0,1}};
		int a[] = new Leet_210().findOrder(2,pre);
		System.out.println();
	}
}

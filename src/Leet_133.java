import java.util.*;

/**
 * Clone an undirected graph. Each node in the graph contains a label and a list of its neighbors.


 OJ's undirected graph serialization:
 Nodes are labeled uniquely.

 We use # as a separator for each node, and , as a separator for node label and each neighbor of the node.
 As an example, consider the serialized graph {0,1,2#1,2#2,2}.

 The graph has a total of three nodes, and therefore contains three parts as separated by #.

 First node is labeled as 0. Connect node 0 to both nodes 1 and 2.
 Second node is labeled as 1. Connect node 1 to node 2.
 Third node is labeled as 2. Connect node 2 to node 2 (itself), thus forming a self-cycle.
 Visually, the graph looks like the following:

 1
 / \
 /   \
 0 --- 2
 / \
 \_/

 */
class UndirectedGraphNode {
      int label;
      List<UndirectedGraphNode> neighbors;
      UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
};
public class Leet_133 {
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		if(node==null)	return null;
		//UndirectedGraphNode first = new UndirectedGraphNode(node.label);
		Stack<UndirectedGraphNode> it = new Stack<UndirectedGraphNode>();
		Map<Integer,UndirectedGraphNode> map = new HashMap<Integer,UndirectedGraphNode>();
		Set<Integer> arrived = new HashSet<Integer>();
		it.add(node);
		while(!it.empty()){
			UndirectedGraphNode current = it.pop();
			if(arrived.contains(current.label)) continue;
			UndirectedGraphNode n;
			if(!map.containsKey(current.label)){
				n = new UndirectedGraphNode(current.label);
			}
			else{
				n = map.get(current.label);
			}
			for(int i=0;i<current.neighbors.size();i++){
				if(!arrived.contains(current.neighbors.get(i).label))	it.push(current.neighbors.get(i));
				if(current.neighbors.get(i).label==current.label)	{
					n.neighbors.add(n);
					continue;
				}
				if(map.containsKey(current.neighbors.get(i).label)){
					n.neighbors.add(map.get(current.neighbors.get(i).label));
				}
				else{
					UndirectedGraphNode element = new UndirectedGraphNode(current.neighbors.get(i).label);
					n.neighbors.add(element);
					map.put(element.label,element);
				}
			}
			arrived.add(n.label);
			map.put(n.label,n);
		}
		return map.get(node.label);
	}
	public static void  main(String args[]){
		UndirectedGraphNode root= new UndirectedGraphNode(0);
		root.neighbors.add(root);
		root.neighbors.add(root);
		UndirectedGraphNode a = new Leet_133().cloneGraph(root);
	}
}

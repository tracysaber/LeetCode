import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a collection of intervals, merge all overlapping intervals.

 For example,
 Given [1,3],[2,6],[8,10],[15,18],
 return [1,6],[8,10],[15,18].


 */
class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
}
public class Leet_56 {
	public List<Interval> merge(List<Interval> intervals) {
		if(intervals.size()<=1)
			return intervals;
		Collections.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start>o2.start?1:(o1.start==o2.start?0:-1);
			}
		});
		List<Interval> result = new LinkedList<Interval>();
		int start = intervals.get(0).start;
		int end = intervals.get(0).end;
		for(Interval interval:intervals){
			if(interval.start<=end){
				end = Math.max(end,interval.end);
			}
			else{
				result.add(new Interval(start,end));
				start = interval.start;
				end = interval.end;
			}
		}
		result.add(new Interval(start,end));
		return result;
	}
	public static void main(String args[]){
		List<Interval>  a = new LinkedList<Interval>();
		a.add(new Interval(1,3));
		a.add(new Interval(2,6));
		a.add(new Interval(8,9));
		List<Interval> b  =new Leet_56().merge(a);

	}
}

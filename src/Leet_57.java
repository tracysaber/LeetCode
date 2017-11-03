import java.util.LinkedList;
import java.util.List;

/**
 * Created by tracysaber on 2017-11-2.
 * Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

 You may assume that the intervals were initially sorted according to their start times.

 Example 1:
 Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].

 Example 2:
 Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].

 This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].


 */
public class Leet_57 {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new LinkedList<Interval>();
        if(intervals.size()==0){
            result.add(newInterval);
            return result;
        }
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        int newstart = newInterval.start;
        int newend = newInterval.end;
        boolean flag = false;
//        for(Interval interval:intervals){
//
//        }
        for(Interval interval:intervals){
            if(!flag) {
                if(newstart<=start){
                    flag = true;
                    if(newend<start){
                        result.add(new Interval(newstart,newend));
                    }
                    else{
                        start = newstart;
                        end = Math.max(newend,end);
                    }
                }
                else{
                    if(newstart<=end){
                        flag =true;
                        end=Math.max(newend,end);
                    }
                }
            }

            if(interval.start>end){
                result.add(new Interval(start,end));
                start =interval.start;
                end = interval.end;
            }
            else{
                end = Math.max(end,interval.end);
            }

        }
        if(!flag) {
            if(newstart<start){
                if(newend<start){
                    result.add(newInterval);
                    result.add(new Interval(start,end));
                    return  result;
                }
                else{
                    start = newstart;
                    end =Math.max(end,newend);
                    result.add(new Interval(start,end));
                    return  result;
                }
            }
            if(newstart>end){
                result.add(new Interval(start,end));
                result.add(newInterval);
                return result;
            }
            else{
                end = Math.max(end,newend);
                result.add(new Interval(start,end));
                return result;
            }
        }
        else{
            result.add(new Interval(start,end));
        }

        return  result;
    }
    public static void main(String args[]){
        List<Interval> a = new LinkedList<Interval>();
        a.add(new Interval(0,5));
        a.add(new Interval(6,16));
//        a.add(new Interval(0,2));
//        a.add(new Interval(3,5));
//        a.add(new Interval(6,8));
//        a.add(new Interval(10,12));
//        a.add(new Interval(13,16));
        List<Interval> b = new Leet_57().insert(a,new Interval(6,11));
    }
}

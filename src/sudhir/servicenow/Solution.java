package sudhir.servicenow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // List<Interval> list = Arrays.asList(new Interval(1,7), new Interval(2,4), new Interval(5,7), new Interval(6,8));
        // res = [1,8]
        // List<Interval> list = Arrays.asList(new Interval(1,3), new Interval(2,4), new Interval(6,8), new Interval(9,10));
        // res = [[1,4], [6,8], [9,10]]
        List<Interval> list = Arrays.asList(new Interval(1,3), new Interval(2,4), new Interval(5,7), new Interval(6,8));
        // res = [1,4] [5,8]
        // List<Interval> list = Arrays.asList(new Interval(6,8), new Interval(1,9), new Interval(2,4), new Interval(4,7));
        // res = [1,9]
        System.out.println(busyTimeForRestaurant(list));
    }

    static class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "[" + this.start + "," + this.end + "]";
        }
    }

    static List<Interval> busyTimeForRestaurant(List<Interval> intervals) {
        if(intervals.size() == 0) return new ArrayList<Interval>();
        if(intervals.size() == 1) return intervals;
        List<Interval> result = new ArrayList<>();
        // intervals.sort((o1, o2) -> o1.start - o2.start);
        intervals.sort(Comparator.comparingInt(o -> o.start));
        result.add(new Interval(intervals.get(0).start, intervals.get(0).end));
        for (int i = 1; i < intervals.size(); i++) {
            int currentStart = intervals.get(i).start;
            int currentEnd = intervals.get(i).end;
            int resultEnd = result.get(result.size()-1).end;

            if(resultEnd >= currentStart){
                result.get(result.size()-1).end = Math.max(currentEnd, resultEnd);
            }else
                result.add(new Interval(currentStart, currentEnd));
        }

        return result;
    }
}

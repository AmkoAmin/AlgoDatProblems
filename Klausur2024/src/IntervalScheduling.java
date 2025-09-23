import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public abstract class IntervalScheduling{
    public static Iterable<Interval> intervalScheduling(Iterable<Interval> intervals){
        PriorityQueue<Interval> pq = new PriorityQueue<>(new IntervalCompareFinishTime());

        for (Interval i : intervals){
            pq.add(i);
        }

        Queue<Interval> queue = new LinkedList<>();
        double finishTime = 0;
        while(!pq.isEmpty()){
            Interval iv = pq.poll();
            if (iv.start() >= finishTime){
                queue.add(iv);
                finishTime = iv.finish();
            }
        }
        return queue;
    }

    public static void main(String[] args) {
        Queue<Interval> intervals = new LinkedList<>();
        intervals.add(new Interval(1, 2));
        intervals.add(new Interval(2, 4));
        intervals.add(new Interval(3, 5));
        intervals.add(new Interval(4, 7));
        intervals.add(new Interval(5, 6));

        Iterable<Interval> jobs = intervalScheduling(intervals);

        for (Interval it : jobs){
            System.out.print(it.start() + " ");
            System.out.println(it.finish());
        }
    }
}
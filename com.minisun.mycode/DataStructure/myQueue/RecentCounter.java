package DataStructure.myQueue;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {

    Queue<Integer> queue;
    public RecentCounter(){
        queue = new LinkedList<Integer>();
    }


    public int ping(int t){
        queue.add(t);
        while (queue.size() >0 && t- queue.peek() > 3000){
            queue.poll();
        }

        return queue.size();
    }

}


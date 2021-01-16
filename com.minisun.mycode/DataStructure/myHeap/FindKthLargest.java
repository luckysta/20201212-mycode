package DataStructure.myHeap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class FindKthLargest {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(findKthLargest(nums,k));
    }

    public static int findKthLargest(int[] nums,int k){
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1,n2)->n2-n1);
        for (int num : nums) {
            heap.offer(num);
        }

        List<Integer> result = new ArrayList<Integer>();
        while (!heap.isEmpty()){
            result.add(heap.poll());
        }
        return result.get(k-1);
    }
}

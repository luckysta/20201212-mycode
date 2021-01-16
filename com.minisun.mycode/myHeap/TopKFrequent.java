package myHeap;



import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {

        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k =2;
        System.out.println(topKFrequent(words,k));

    }

    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> count = new HashMap<>();
        for (String word : words) {
            count.put(word,count.getOrDefault(word,0)+1);
        }

        PriorityQueue<String> heap = new PriorityQueue<String>((w1, w2) ->count.get(w1).equals(count.get(w2))?w2.compareTo(w1):count.get(w1)-count.get(w2));


        for (String word : count.keySet()) {
            heap.offer(word);
            if(heap.size()>k){
                heap.poll();
            }
        }



        List<String> keyWords = new ArrayList<>();
        while (!heap.isEmpty()){
            keyWords.add(heap.poll());
        }
        Collections.reverse(keyWords);
        return keyWords;

    }
}

package Algorithm.Recursion;

import DataStructure.myList.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Hanota {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        List<Integer> C = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            A.add(i);
        }
        System.out.println("A:"+A.toString());
        System.out.println("B"+B.toString());
        System.out.println("C"+C.toString());
        hanota(A,B,C);
        System.out.println("A:"+A.toString());
        System.out.println("B"+B.toString());
        System.out.println("C"+C.toString());


    }

    public static void hanota(List<Integer> A,List<Integer> B,List<Integer> C){
        movePlate(A.size(),A,B,C);
        C.addAll(A);
    }

    /**
     * 递归汉诺塔
     * @param num 剩余盘子数
     * @param original 源
     * @param auxiliary 中间过渡
     * @param target 目标
     */
    public static void movePlate(int num,List<Integer> original,List<Integer> auxiliary,List<Integer> target){
        if(num == 1){
            target.add(original.remove(original.size()-1));
            return;
        }
        movePlate(num-1,original,target,auxiliary);
        target.add(original.remove(original.size()-1));
        movePlate(num-1,auxiliary,original,target);

    }
}

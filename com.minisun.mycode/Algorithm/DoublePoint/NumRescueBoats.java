package Algorithm.DoublePoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class NumRescueBoats {
    public static void main(String[] args) {
        int[] people = {3,5,3,4};
        int limit = 5;
        System.out.println(numRescueBoats(people,limit));
    }
    public static int numRescueBoats(int[] people,int limit){
        if(null == people){
            return 0;
        }
        Arrays.sort(people);
        int a = 0;
        int b = people.length-1;
        int boats = 0;
        while ( a <= b){
            if(people[b] + people[a]  <= limit){
                    boats++;
                b--;
                a++;
            }else {
                    boats++;
                b--;
            }
        }
        return boats;


    }
}

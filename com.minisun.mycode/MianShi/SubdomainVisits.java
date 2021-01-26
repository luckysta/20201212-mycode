package MianShi;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class SubdomainVisits {


    public static void main(String[] args) {
        String[] nums = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> result = subdomainVisits(nums);
        System.out.println(result);
    }


    public static List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> counts =  new HashMap<>();
        for(String cpdomain : cpdomains){
            String[] countCpdomains = cpdomain.split(" ");
            Integer countCpdomain = Integer.valueOf(countCpdomains[0]);
            String[] subCpdomains= countCpdomains[1].split("\\.");
            String keyString = "";
            for (int i = subCpdomains.length-1; i >= 0; i--) {
               if(keyString == ""){
                   keyString = subCpdomains[i];
               }else {
                   keyString = String.join(".",subCpdomains[i],keyString);
               }
                if(counts.containsKey(keyString)){
                    counts.put(keyString,counts.get(keyString)+countCpdomain);
                }else {
                    counts.put(keyString,countCpdomain);
                }
            }
        }
        List<String> result = new LinkedList<>();
        for (String s : counts.keySet()) {
            result.add(String.join(" ",counts.get(s).toString(),s));
        }
        return result;
    }

}

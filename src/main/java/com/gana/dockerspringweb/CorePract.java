package com.gana.dockerspringweb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CorePract {

    public static void main(String[] args) {
        String[] input1 = {"KFC","Burgers King","FC"};
        String[] input2 = {"FC","Burger King","KFC"};

        String[] result = findSolution(input1,input2);

        for(String s:result){
            System.out.println("Solution" + s);
        }
    }

    public static String[] findSolution(String[] input1,String[] input2){
        Map<String,Integer> commonMap =new HashMap<>();
        String[] result=new String[input1.length+ input2.length];

        List<String> fistList = Arrays.asList(input1);
        int arrInd=0;
        int ind1=0;
        int firstMatch ;
        int secondMatch =firstMatch= Integer.MAX_VALUE;
        for(String s: input2){
            if(fistList.contains(s)){
                int indexOf = fistList.indexOf(s);
                int sum = indexOf+ind1;
                if(sum < firstMatch){
                    firstMatch = sum;
                    result[arrInd] = s;
                    arrInd++;
                }
                else if(sum < secondMatch ){
                    String temp= result[arrInd-1];
                    result[arrInd-1] = s;
                    result[arrInd] = temp;
                }
                commonMap.put(s,sum);
            }
            ind1++;
        }

        List<Map.Entry<String, Integer>> collect = commonMap.entrySet().stream().sorted((t, t1) -> t.getValue().compareTo(t1.getValue())).collect(Collectors.toList());

        System.out.println("Map values");
        for(Map.Entry s:collect){
            System.out.println("Key "+ s.getKey());
            System.out.println("Value" + s.getValue());
        }

        return result;
    }

}

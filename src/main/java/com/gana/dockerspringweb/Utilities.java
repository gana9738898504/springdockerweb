package com.gana.dockerspringweb;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Utilities {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("Ram","raja","sita");

        names.forEach(nara-> System.out.println(nara));

        for(String name:names){

            if(name.equalsIgnoreCase("raja")){
                System.out.println("salary");
            }
        }
        Predicate<String> p= new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s.equalsIgnoreCase("raja")){
                    return true;
                }
                return false;
            }
        };

        Predicate<String> p1=null;

        Optional<Predicate> o= Optional.ofNullable(p);


        if(o.isPresent()){
            System.out.println("predicate value"+o.get().test("ramana"));
        }else {
            System.out.println("PRedicate not exists");
        }



        boolean rameshVal = p.test("ramesh");

        long rajaCount = names.stream().filter(p::test).count();





        List<String> resultList = names.stream().filter(t -> t.equalsIgnoreCase("rajaaaaaaa")).collect(Collectors.toList());

        System.out.println("result List :" + resultList);
        TestABImpl impl= new TestABImpl();

        impl.specialoffer(10);


        TestA.specialoffers(10);
        TestB.specialoffers(11);


        Stream<String> mystream = Stream.of("Maruti", "Renault", "Audi");



    }
}

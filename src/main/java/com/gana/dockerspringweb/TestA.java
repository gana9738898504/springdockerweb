package com.gana.dockerspringweb;

public interface TestA {

    int run(int a,int b);

    default int specialoffer(int a){
        return 0;
    }

    static int specialoffers(int a){
        return 0;
    }

}

package com.gana.dockerspringweb;

public interface TestB {

    int run(int a,int b);

    default int specialoffer(int a){
        return 1;
    }

    static int specialoffers(int a){
        return 0;
    }
}

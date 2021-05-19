package com.gana.dockerspringweb;

public class TestABImpl implements TestA,TestB {
    @Override
    public int run(int a, int b) {
        return 0;
    }

    public int specialoffer(int a){
        return TestB.super.specialoffer(a);
    }

}

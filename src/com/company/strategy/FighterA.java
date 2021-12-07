package com.company.strategy;

public class FighterA extends Fighter {
    public FighterA(KickBehaviour kickBehaviour, JumpBehaviour jumpBehaviour) {
        super(kickBehaviour, jumpBehaviour);
    }

    @Override
    public void display() {
        System.out.println("Fighter A");
    }
}

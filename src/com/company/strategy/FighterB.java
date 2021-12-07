package com.company.strategy;

public class FighterB extends Fighter {
    public FighterB(KickBehaviour kickBehaviour, JumpBehaviour jumpBehaviour) {
        super(kickBehaviour, jumpBehaviour);
    }

    @Override
    public void display() {
        System.out.println("Fighter B");
    }
}

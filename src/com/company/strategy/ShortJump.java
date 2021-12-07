package com.company.strategy;

public class ShortJump implements JumpBehaviour {
    @Override
    public void jump() {
        System.out.println("Short Jump");
    }
}

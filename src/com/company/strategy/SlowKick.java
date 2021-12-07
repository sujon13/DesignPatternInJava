package com.company.strategy;

public class SlowKick implements KickBehaviour {
    @Override
    public void kick() {
        System.out.println("Slow Kick");
    }
}

package com.company.strategy;

public class FastKick implements KickBehaviour {
    @Override
    public void kick() {
        System.out.println("Fast Kick");
    }
}

package com.company.strategy;

public class StrategyClient {
    public void test() {
        KickBehaviour slowKick = new SlowKick();
        JumpBehaviour shortJump = new ShortJump();
        Fighter fighterA = new FighterA(slowKick, shortJump);
        fighterA.punch();
        fighterA.jump();

        // change behaviour runtime
        fighterA.setJumpBehaviour(new LongJump());
        fighterA.jump();
    }
}

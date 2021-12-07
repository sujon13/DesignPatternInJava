package com.company.strategy;

public abstract class Fighter {
    private KickBehaviour kickBehaviour;
    private JumpBehaviour jumpBehaviour;

    public Fighter(KickBehaviour kickBehaviour, JumpBehaviour jumpBehaviour) {
        this.kickBehaviour = kickBehaviour;
        this.jumpBehaviour = jumpBehaviour;
    }

    public void setKickBehaviour(KickBehaviour kickBehaviour) {
        this.kickBehaviour = kickBehaviour;
    }

    public void setJumpBehaviour(JumpBehaviour jumpBehaviour) {
        this.jumpBehaviour = jumpBehaviour;
    }

    public void punch() {
        System.out.println("Default Punch");
    }

    public void roll() {
        System.out.println("Default Roll");
    }

    public void kick() {
        kickBehaviour.kick();;
    }

    public void jump() {
        jumpBehaviour.jump();
    }

    public abstract void display();
}

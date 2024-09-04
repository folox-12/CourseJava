package lessons.level.second.first.entity;

import lessons.level.second.first.utils.IFullMoveableAbility;

public class Human implements IFullMoveableAbility {
    private int maxJumpingDistance;
    private int maxRunningDistance;

    public Human(int maxJumpingDistance, int maxRunningDistance) {
        this.maxJumpingDistance = maxJumpingDistance;
        this.maxRunningDistance = maxRunningDistance;
    }

    @Override
    public int getMaxJumpingDistance() {
        return maxJumpingDistance;
    }

    @Override
    public int getMaxRunningDistance() {
        return maxRunningDistance;
    }

    @Override
    public void jump() {
        System.out.println("Human is jumping");
    }

    @Override
    public void run() {
        System.out.println("Human is running");
    }
}

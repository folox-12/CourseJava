package lessons.level.second.first.entity;

import lessons.level.second.first.utils.IFullMoveableAbility;

public class Robot implements IFullMoveableAbility {
    private int maxJumpingDistance;
    private int maxRunningDistance;

    public Robot(int maxJumpingDistance, int maxRunningDistance) {
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
        System.out.println("Robot is running");
    }

    @Override
    public void run() {
        System.out.println("Robot is jumping");
    }
}

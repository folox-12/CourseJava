package lessons.level.second.first.entity;

import lessons.level.second.first.utils.IJumpAbility;
import lessons.level.second.first.utils.IObstruction;

public class Wall implements IObstruction<IJumpAbility> {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overcomeThrough(IJumpAbility entity) throws Exception {
        if (entity.getMaxJumpingDistance() < height) throw new Exception("Высота препятствия слишком высокая");
        entity.jump();
    }
}

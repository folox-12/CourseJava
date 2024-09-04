package lessons.level.second.first.entity;

import lessons.level.second.first.utils.IObstruction;
import lessons.level.second.first.utils.IRunAbility;

public class Treadmill implements IObstruction<IRunAbility> {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public void overcomeThrough(IRunAbility entity) throws Exception {
        if (entity.getMaxRunningDistance() < distance) throw new Exception("Дистанция слишком большая");
        entity.run();
    }
}

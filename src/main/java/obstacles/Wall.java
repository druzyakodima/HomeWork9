package obstacles;

import participants.Human;

public class Wall implements Obstacles {

    int heightWall = 10;

    @Override
    public void passObstacles() {
        System.out.println("wall");
    }
}

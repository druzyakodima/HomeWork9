package participants;

import obstacles.Obstacles;

public class Robot implements Participants {

    int forcePoints = 40;

    @Override
    public void run(Obstacles obstacles) {
        forcePoints -= 15;
        if (forcePoints <= 0) {
            System.out.println("The robot has run out of strength");
        } else {
            System.out.print("Robot ran ");
            obstacles.passObstacles();
        }
    }

    @Override
    public void jump(Obstacles obstacles) {
        forcePoints -= 15;
        if (forcePoints <= 0) {
            System.out.println("The man has run out of strength");
        } else {
            System.out.print("Robot jumped ");
            obstacles.passObstacles();
        }
    }
}

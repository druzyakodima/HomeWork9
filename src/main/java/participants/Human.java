package participants;

import obstacles.Obstacles;

public class Human implements Participants {

    int forcePoints = 20;

    @Override
    public void run(Obstacles obstacles) {
        forcePoints -= 15;
        if (forcePoints <= 0) {
            System.out.println("The man has run out of strength");
        } else {
            System.out.print("Human ran ");
            obstacles.passObstacles();
        }
    }

    @Override
    public void jump(Obstacles obstacles) {
        forcePoints -= 15;
        if (forcePoints <= 0) {
            System.out.println("The man has run out of strength");
        } else {
            System.out.print("Human jumped ");
            obstacles.passObstacles();
        }
    }
}
package participants;

import obstacles.Obstacles;

public class Cat implements Participants {
    int forcePoints = 20;

    @Override
    public void run(Obstacles obstacles) {
        forcePoints -= 15;
        if (forcePoints <= 0) {
            System.out.println("The cat has run out of strength");
        } else {
            System.out.print("Cat ran ");
            obstacles.passObstacles();
        }
    }

    @Override
    public void jump(Obstacles obstacles) {
        forcePoints -= 15;
        if (forcePoints <= 0) {
            System.out.println("The cat has run out of strength");
        } else {
            System.out.print("Cat jumped ");
            obstacles.passObstacles();
        }
    }
}

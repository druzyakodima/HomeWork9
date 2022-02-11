import obstacles.Obstacles;
import obstacles.Track;
import obstacles.Wall;
import participants.Cat;
import participants.Human;
import participants.Participants;
import participants.Robot;

public class Competitions {
    public void competitions() {

        Human human = new Human();
        Cat cat = new Cat();
        Robot robot = new Robot();

        Wall wall = new Wall();
        Track track = new Track();

       /* human.run(track);
        human.jump(wall);
        cat.run(track);
        cat.jump(wall);
        robot.run(track);
        robot.jump(wall);*/

        Participants[] arrayParticipants = {human, cat, robot};
        Obstacles[] arrayObstacles = {wall, track};

        for (int i = 0; i < arrayObstacles.length; i++) {
            for (int j = 0; j < arrayParticipants.length; j++) {
                if (i == 0) {
                    arrayParticipants[j].run(track);
                } else {
                    arrayParticipants[j].jump(wall);
                }
            }
        }
    }
}
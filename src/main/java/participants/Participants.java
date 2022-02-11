package participants;

import obstacles.Obstacles;
import obstacles.Track;
import obstacles.Wall;

public interface Participants {

    public void run(Obstacles obstacles);

    public void jump(Obstacles obstacles);
}

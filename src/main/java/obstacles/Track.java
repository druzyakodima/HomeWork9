package obstacles;

public class Track implements Obstacles {

    int longTrack = 15;

    @Override
    public void passObstacles() {
        System.out.println("track");
    }
}

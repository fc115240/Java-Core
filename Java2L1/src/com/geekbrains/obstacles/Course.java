package com.geekbrains.obstacles;

        import com.geekbrains.participants.Team;

public class Course{
    Obstacle[] obstacles;

    public Course(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team t) {
        for(Obstacle o : obstacles) {
            o.doIt(t);
            if(!t.isActive()) {
                break;
            }
        }
    }

}

package com.geekbrains;

import com.geekbrains.participants.*;
import com.geekbrains.obstacles.*;

public class MainClass {
    public static void main(String[] args) {
        Participant[] participants = {new Human("Bob"), new Cat("Barsik"), new Dog("Bobik")};
        Obstacle[] obstacles = {new Cross(200), new Water(20), new Wall(2), new Cross(500)};
        for(Participant p : participants) {
            for(Obstacle o : obstacles) {
                o.doIt(p);
                if(!p.isActive()) {
                    break;
                }
            }
        }
        for(Participant p : participants) {
            if(p.isActive()) {
                System.out.println(p.getName() + " win");
            } else {
                System.out.println(p.getName() + " lose");
            }
        }
    }
}

package com.geekbrains.participants;

public class Team implements Participant{
    String name;
    Participant[] participants;

    public Team(String name, Participant[] participants) {
        this.name = name;
        this.participants = participants;
    }

    public void showTeam() {
        for(Participant p : participants) {
            System.out.println("Team: " + name + " Member: " + p.getName());
        }
    }

    public void showResults() {
        for(Participant p : participants) {
            if(p.isActive()) {
                System.out.println("Team: " + name + " Member: " + p.getName() + " win");
            } else {
                System.out.println("Team: " + name + " Member: " + p.getName() + " lose");
            }
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isActive() {
        boolean active = false;
        for(Participant p : participants) {
            active |= p.isActive();
        }
        return active;
    }

    @Override
    public void run(int distance) {
        for(Participant p : participants) {
            p.run(distance);
        }
    }

    @Override
    public void swim(int distance) {
        for(Participant p : participants) {
            p.swim(distance);
        }
    }

    @Override
    public void jump(int height) {
        for(Participant p : participants) {
            p.jump(height);
        }
    }

}

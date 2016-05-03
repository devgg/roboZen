package edu.kit.robocup.game;


public class Player extends AGameObject {
    private final Team team;
    private final int number;
    private double orientation;
    private Memory memory;

    public Player(Team team, int number, double positionX, double positionY, double orientation) {
        super(positionX, positionY);
        this.team = team;
        this.number = number;
        this.orientation = orientation;
    }

    public Team getTeam() {
        return team;
    }

    public int getNumber() {
        return number;
    }

    public double getOrientation() {
        return orientation;
    }

    public void setOrientation(double orientation) {
        this.orientation = orientation;
    }
}

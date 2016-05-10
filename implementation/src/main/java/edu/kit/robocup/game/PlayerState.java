package edu.kit.robocup.game;


public class PlayerState implements IPlayer, IGameObject {
    private final String teamName;
    private final int number;
    private final double positionX;
    private final double positionY;
    private final double velocityX;
    private final double velocityY;

    public PlayerState(String teamName, int number, double positionX, double positionY) {
        this(teamName, number, positionX, positionY, 0, 0);
    }

    public PlayerState(String teamName, int number, double positionX, double positionY, double velocityX, double velocityY) {
        this.teamName = teamName;
        this.number = number;
        this.positionX = positionX;
        this.positionY = positionY;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public double getPositionX() {
        return positionX;
    }

    @Override
    public double getPositionY() {
        return positionY;
    }

    @Override
    public double getVelocityX() {
        return velocityX;
    }

    @Override
    public double getVelocityY() {
        return velocityY;
    }

    @Override
    public boolean isTeam(String teamName) {
        return this.teamName.equals(teamName);
    }

    @Override
    public boolean hasNumber(int number) {
        return this.number == number;
    }
}

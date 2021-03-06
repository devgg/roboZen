package edu.kit.robozen.game;


public enum PlayMode {
    BEFORE_KICK_OFF, PLAY_ON, TIME_OVER, KICK_OFF_EAST, KICK_OFF_WEST, GOAL_SIDE_EAST, GOAL_SIDE_WEST, UNKNOWN;

    public static PlayMode get(String message) {
        if (message.startsWith("before_kick_off")) {
            return BEFORE_KICK_OFF;
        } else if (message.startsWith("play_on")) {
            return PLAY_ON;
        } else if (message.startsWith("time_over")) {
            return TIME_OVER;
        } else if (message.startsWith("kick_off_r")) {
            return KICK_OFF_EAST;
        } else if (message.startsWith("kick_off_l")) {
            return KICK_OFF_WEST;
        } else if (message.startsWith("goal_r_")) {
            return GOAL_SIDE_EAST;
        } else if (message.startsWith("goal_l_")) {
            return GOAL_SIDE_WEST;
        } else if (message.startsWith("goal_l_")) {
            return GOAL_SIDE_WEST;
        } else if (message.startsWith("goal_l_")) {
            return GOAL_SIDE_WEST;
        } else {
            return UNKNOWN;
        }
    }
}

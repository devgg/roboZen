package edu.kit.robocup;

import edu.kit.robocup.constant.PitchSide;
import edu.kit.robocup.interf.mdp.IPolicy;
import edu.kit.robocup.mdp.Reward;
import edu.kit.robocup.mdp.ValueIteration;
import edu.kit.robocup.mdp.transition.Game;
import edu.kit.robocup.recorder.GameReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MainTransition {
    public static void main(String[] args) throws IOException, InterruptedException {
        List<Game> games = GameReader.getGamesFromFiles("recordings/chaseAndKick", "recordings/chaseAndKick1", "recordings/chaseAndKick1", "recordings/random");
        ValueIteration v = new ValueIteration(games, new Reward(2000,-2000,50, -50, 70, 170, -170, PitchSide.EAST));
        IPolicy valueiterationPolicy = v.solve();
    }
}
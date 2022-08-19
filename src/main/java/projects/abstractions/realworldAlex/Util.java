package projects.abstractions.realworldAlex;

import java.util.Random;

public class Util {

    public static int generateTaskID(){
        Random random = new Random();
        return random.nextInt(100);
    }
}

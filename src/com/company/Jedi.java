package com.company;

/**
 * Created by phillipdelia on 7/24/17.
 */
public class Jedi extends Soldier implements LightSaberFighting{

    String name = "Luke";
    String rank = "Knight";

    boolean isOnDuty() {
        return true;
    }

    @Override
    boolean canSwim() {
        return false;
    }

    int shootingRange(){
        return 200;
    }

    public String speak(){
        return "You are strong in the force!";
    }
    public String defensiveParry(){
        return "You just successfully defended an attack!";
    }
    public String stabTorso(){
        return "You just stabbed a stormtrooper.";
    }
    public String cutOffHand() {
        return "You just cut off Vader's hand.";
    }


}

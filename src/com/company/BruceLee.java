package com.company;

/**
 * Created by phillipdelia on 7/24/17.
 */
public class BruceLee extends Soldier implements KungFuFighting {

    String name = "Bruce";
    String rank = "Master";


    @Override
    boolean isOnDuty() {
        return false;
    }

    @Override
    boolean canSwim() {
        return true;
    }

    @Override
    int shootingRange() {
        return 40;
    }

    public String speak(){
        return "Be like water.";

    }


    public String kicks(){
        return "Kick-ass.";
    }
    public String punches(){
        return "Everybody was kung fu fighting!";
    }
    public String legSweep(){
        return "Sweep the Leg Johnny!";
    }

}

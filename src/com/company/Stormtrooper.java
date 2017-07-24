package com.company;

/**
 * Created by phillipdelia on 7/24/17.
 */
public class Stormtrooper extends Soldier implements ThrowBomb {

    String name = "Sam";
    String rank = "Corporal";

    boolean isOnDuty() {
        return true;
    }

    @Override
    boolean canSwim() {
        return false;
    }


    @Override
    int shootingRange(){
        return  80;
    }

    @Override
    public String speak() {
        return "Long live the empire.";
    }

    @Override
    public String defensiveParry() {
        return "I can't use a light saber.";
    }

    @Override
    public String stabTorso() {
        return "I really cant use a light saber";
    }

    @Override
    public String cutOffHand() {
        return "I'm not kidding.  I can't";
    }



    @Override
    public String bomb() {
        return "BOOM!";
    }
}

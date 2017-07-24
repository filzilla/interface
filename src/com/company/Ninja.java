package com.company;

/**
 * Created by phillipdelia on 7/24/17.
 */
public class Ninja extends Soldier implements NinjaFighting{

    String name = "Steve";
    String rank = "Master";

    boolean canSwim(){
        return true;
    }

    @Override
    boolean isOnDuty() {
        return false;
    }

    int shootingRange(){
            return 10;
        }


    public String speak(){
        return "shhhhhhhh";
    }

    public String  climbWalls(){
        return "I can climb walls silently.";
    }
    public String throwthrowingStars(){
        return "I can hit you with a throwing star.";
    }
    public String hideInShadows(){
        return "I can hide in shadows.";
    }
    public String FivePointHeartExplodingMove(){
        return "Kill Bill fan.";
    }



}

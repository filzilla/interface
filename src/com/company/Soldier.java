package com.company;

/**
 * Created by phillipdelia on 7/24/17.
 */
public abstract class Soldier {
    String name;
    String rank;
    int serialNumber;

    abstract boolean canSwim();
    abstract boolean isOnDuty();
    abstract int shootingRange();

    public abstract String speak();

}

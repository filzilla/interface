package com.company;

/**
 * Created by phillipdelia on 7/24/17.
 */
public interface KungFuFighting {

    public String kicks();


    public String punches();

    public String legSweep();

    default public String breakConcrete(){

        return "This is a default method within my Kung Fu Fighting Interface.  I can crack concrete.";
    }


}

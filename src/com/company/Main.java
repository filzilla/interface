package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Ninja ninja = new Ninja();

        System.out.println(ninja.rank);
        System.out.println(ninja.name);

        System.out.println(ninja.speak());

        System.out.println(ninja.FivePointHeartExplodingMove());
        System.out.println(ninja.throwthrowingStars());
        System.out.println(ninja.hideInShadows());
        System.out.println(ninja.climbWalls());

        System.out.println("Is on duty: " + ninja.isOnDuty());
        System.out.println("Can swim " + ninja.canSwim());
        System.out.println("Shooting Range: " + ninja.shootingRange()+ " meters");

        Jedi jedi = new Jedi();

        System.out.println(jedi.rank);
        System.out.println(jedi.name);

        System.out.println(jedi.speak());

        System.out.println(jedi.defensiveParry());
        System.out.println(jedi.cutOffHand());
        System.out.println(jedi.stabTorso());
        System.out.println(jedi.serialNumber);

        System.out.println("Is on duty: " + jedi.isOnDuty());
        System.out.println("Can swim: " + jedi.canSwim());
        System.out.println("Shooting Range: " + jedi.shootingRange() + " meters");

        BruceLee Lee = new BruceLee();

        System.out.println(Lee.rank);
        System.out.println(Lee.name);

        System.out.println(Lee.speak());

        System.out.println(Lee.punches());
        System.out.println(Lee.kicks());
        System.out.println(Lee.legSweep());



        System.out.println("Is on duty: " + Lee.isOnDuty());
        System.out.println("Can swim: " + Lee.canSwim());
        System.out.println("Shooting Range: " + Lee.shootingRange()+ " meters");

        //// Extending the Bomb Interface from JediFighting and Testing

        Stormtrooper stormtrooper = new Stormtrooper();

        System.out.println(stormtrooper.bomb());


        //// Testing the Default Method

        System.out.println(Lee.breakConcrete());




    }
}

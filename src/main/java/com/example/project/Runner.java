package com.example.project;

public class Runner {
    public static void main(String[] args) {
        HorseBarn barn1 = new HorseBarn(6);
        Horse Trigger = new Horse("Trigger", 1340);
        Horse Silver = new Horse("Silver",1210) ;
        Horse Lucy = new Horse("Lucy",1500);
        Horse Cotton = new Horse("Cotton", 1555);
        barn1.placeHorse(Trigger, 0);
        barn1.placeHorse(Silver, 1);
        barn1.placeHorse(Lucy, 4);
        barn1.placeHorse(Cotton, 5);
        barn1.consolidate();
        Horse[] expected = new Horse[6];
        expected[0]= Trigger;
        expected[1] = Silver;
        expected[2] = Lucy;
        expected[3] = Cotton;

        for (Horse each : expected) {
            if (each != null) {
                System.out.print(each.getName() + " ");
            } else {
                System.out.print("null ");
            }
        }
        System.out.println();

        for (Horse each : barn1.getStalls()) {
            if (each != null) {
                System.out.print(each.getName() + " ");
            } else {
                System.out.print("null ");
            }
        }
        System.out.println();
    }
}

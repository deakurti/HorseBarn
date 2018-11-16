public class Runner {
    public static void main(String[] args){
        Horse horse1 = new Mustang("Horse #1", 12000);
        Horse horse2 = new Mustang('Horse #2', 22000);
        Horse horse3 = new Mustang("Horse #3", 12000);

        Horse[] horses = new Horse[6]; //array of 6 spaces//

        horses[1] = horse1;
        houses[3] = horse2;
        horses[5] = horse3;
        HorseBarn barn = new HorseBarn(horses);

        System.out.println(barn);
        System.out.println("Horse #1 is having fun" + barn.findHorseSpace("Horse #1"));

        barn.consolidate(); //moves the three horses to the front//

        System.out.println(barn);
        System.out.println("Horse #1 is having fun" +barn.findHorseSpace);

    }

}

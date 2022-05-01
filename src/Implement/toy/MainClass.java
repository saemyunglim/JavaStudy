package Implement.toy;

public class MainClass {
    public static void main(String[] args) {
        Toy toyAirplane = new ToyAirplane();
        Toy toyRobot = new ToyRobot();

        Toy[] toys = {toyAirplane, toyRobot};

        for (int i = 0; i < toys.length; i++) {
            toys[i].walk();
            toys[i].run();
            toys[i].alarm();
            toys[i].light();

            System.out.println();
        }

    }
}

package domotica.test;

import domotica.command.CloseDoors;
import domotica.command.OpenDoors;
import domotica.model.ElectricityException;
import domotica.model.House;
import domotica.model.Living;

public class CommandTest {
    public static void main(String[] args) throws ElectricityException {
        House house = new House("house");
        CloseDoors closeDoors = new CloseDoors(house.getBathroom());
        OpenDoors openDoors = new OpenDoors(house.getBathroom());

        System.out.println(house.getBathroom().isDoorClosed());
        openDoors.execute();
        System.out.println(house.getBathroom().isDoorClosed());
        closeDoors.execute();
        System.out.println(house.getBathroom().isDoorClosed());



    }
}

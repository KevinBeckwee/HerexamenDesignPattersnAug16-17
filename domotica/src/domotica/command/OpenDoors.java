package domotica.command;

import domotica.model.ElectricityException;
import domotica.model.Room;

public class OpenDoors implements CommandInterface {
    Room room;

    public OpenDoors(Room room) {
        this.room = room;
    }

    @Override
    public void execute() throws ElectricityException {
        room.setDoorsClosed(false);

    }
}

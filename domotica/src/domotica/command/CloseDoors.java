package domotica.command;

import domotica.model.ElectricityException;
import domotica.model.Room;

public class CloseDoors implements CommandInterface {
    Room room;




    public CloseDoors(Room room){this.room = room;};

    @Override
    public void execute() throws ElectricityException {
        room.setDoorsClosed(true);

    }
}

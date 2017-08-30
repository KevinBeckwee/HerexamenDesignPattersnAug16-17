package domotica.command;

import domotica.model.ElectricityException;
import domotica.model.Room;

public interface CommandInterface {

    void execute() throws ElectricityException;

}

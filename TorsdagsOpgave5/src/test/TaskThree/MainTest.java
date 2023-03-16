package TaskThree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static TaskThree.Main.countLampsInBuilding;
import static TaskThree.Main.isNormal;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    //3.l Make unittests for countLampsInBuilding and isNormal using JUnit.
    @Test
    void countLampsInBuildingTest() {
        ArrayList<Room> rooms = new ArrayList<>();
        Room r1 = new Room(2, 2, 2);
        rooms.add(r1);
        Building building = new Building(rooms, 2, 3, true);
        countLampsInBuilding(building);
        assertEquals(2, countLampsInBuilding(building));
    }


    @Test
    void isNormalTest() {
        ArrayList<Room> rooms = new ArrayList<>();
        Room r1 = new Room(2, 2, 2);
        rooms.add(r1);
        Building building = new Building(rooms, 2, 3, true);
        isNormal(building);
        assertEquals(true, isNormal(building));
    }


}

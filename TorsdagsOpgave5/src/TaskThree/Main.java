package TaskThree;

import java.util.ArrayList;

public class Main {

    /*3.j create a static method in Main, countLampsInBuilding, that takes an object of type Building,
    and returns the total number of lamps in the entire building.*/

    public static int countLampsInBuilding(Building building) {
        int sum = 0;
        for (Room r : building.getRooms()) {
            sum += r.getNumberOfLamps();
        }
        return sum;
    }

    /* 3.k create another static method in Main, isNormal, that takes an object of type Building.
    The method should return true if the Building's numberOfFloors is greater than its number of Rooms.
    If not it should print "This is an odd building" and return false.*/
    public static boolean isNormal(Building building) {
        if (building.getNumberOfFloors() > building.getRooms().size()) {
            return true;
        }
        System.out.println("This is an odd building");
        return false;
    }

    public static void main(String[] args) {
        // 3.g In your main method, instantiate at least three different rooms.
        Room room1 = new Room(1, 1, 1);
        Room room2 = new Room(2, 2, 2);
        Room room3 = new Room(3, 3, 3);

    /* 3.h Add the three rooms to a collection (preferably of the same data type used for the
     "rooms" field in your Building.java class). */

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        // 3.i In your main method, instantiate a new building.
        Building building1 = new Building(rooms, 5, 10, true);
    }

}

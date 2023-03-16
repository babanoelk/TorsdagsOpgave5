package TaskThree;

public class Room {
    // 3.a Create a Room.java class with the following fields (use appropriate types and make them private):
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    //3.b Create a constructor that populates all the fields above.
    public Room(int numberOfDoors, int numberOfLamps, int numberOfWindows){
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }
    //3.c As the fields of the Room class are private, create getter()-methods for them
    public int getNumberOfDoors(){
        return this.numberOfDoors;
    }
    public int getNumberOfLamps(){
        return this.numberOfLamps;
    }
    public int getNumberOfWindows(){
        return this.numberOfWindows;
    }

}

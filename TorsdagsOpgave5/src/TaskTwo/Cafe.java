package TaskTwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    /*2.c Create another class called Cafe. Give it an attribute called 'coffeeMenu' of type ArrayList<String>.
    (Later you will fill this ArrayList with the names of the coffees from the textfile).*/
    private ArrayList<String> coffeeMenu = new ArrayList<>();

    /*2.c In the Cafe class, add a method loadMenuData Have the method load the coffees.txt file like this:
    File file = new File("coffees.txt)
    (make sure that the path is right)*/

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }

    public void loadMenuData() {
        File file = new File("src/TaskTwo/coffees.txt");

        /*2.d In this step you will read from the file, using a Scanner object: Add the file instance to a
        new Scanner object. (This piece of code will need to be wrapped in a try -catch block) */
        try {
            Scanner scanner = new Scanner(file);
            /* 2.e Inside the try block from the last step, you will now add this piece of code that loops over
            the lines of the textfile: */
            while (scanner.hasNextLine()) {
                coffeeMenu.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file to be found!");
        }
    }
}


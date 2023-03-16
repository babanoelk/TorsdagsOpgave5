/*2.a Above you will see a file called coffees.txt. Open it and check that is contains 5 names for types of coffee.
Download it, or copy the text to a new textfile and save it with the same name. Place coffees.txt in the same folder
as the classes you will write for this task.*/

package TaskTwo;

public class Main {

    // 2.b Create a class called Main with a main method.
    public static void main(String[] args) {
        // 2.g In the main method create a new instance of the Cafe class and call its loadMenuData() -method.
        Cafe cafe = new Cafe();
        cafe.loadMenuData();
    /* 2.h Still in the main method, print all the elements of the attribute coffeeMenu of the Cafe instance
    you just created. */

        for (String c : cafe.getCoffeeMenu()) {
            System.out.println(c);
        }
    }
}

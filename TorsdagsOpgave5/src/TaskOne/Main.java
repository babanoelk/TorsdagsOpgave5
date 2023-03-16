package TaskOne;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Customer> customers = new ArrayList<>();
    public static void printCustomers(){
        for(Customer c: customers){
            System.out.println(c);
        }
    }

    public static void main(String[] args) {

    /* 1.c Skriv en Main klasse med en main metode, hvor der oprettes en ArrayList, som du kalder 'customers'.
    Denne skal være erklæret som static global variabel - dvs tilgængelig udenfor main metoden. Tilføj 6 instanser
    af Customer-klassen til listen customers. Dette gør du i main-metoden.
    (Du kan oprette instanserne først, og så add'e dem til array'et. Du kan også adde og instantiere i samme linie.) */
        customers.add(new Customer("A1", "B1", "Customer1"));
        customers.add(new Customer("A2", "B2", "Customer2"));
        customers.add(new Customer("A3", "B3", "Customer3"));
        customers.add(new Customer("A4", "B4", "Customer4"));
        customers.add(new Customer("A5", "B5", "Customer5"));
        customers.add(new Customer("A6", "B6", "Customer6"));

        printCustomers();
    }
}

package Facade;

import Bridge.*;
import Observer.Client;
import Observer.Company;

import java.util.Scanner;

public class Reception {
    Company antiCafe = new Company();
    Client client = new Client();
    Scanner sc = new Scanner(System.in);

    public void createDeleteClient(int option, String name){
        if(option == 6){
            client.setName(name);
            antiCafe.registerUser(client);
            System.out.println("Client " + client.getName() + " successfully registered!");
        } else if(option == 7){
            antiCafe.deleteUser(client);
            System.out.println("Client " + client.getName() + " successfully deleted!");
        }
    }

    public void createRooms(double cost){
        AdditionalOrder additionalOrder = new ColaOrder();
        AdditionalOrder additionalOrder1 = new FantaOrder();
        Drinks cola = new Cola();
        Drinks fanta = new Fanta();
        additionalOrder.setAdditionalTings(cola);
        additionalOrder1.setAdditionalTings(fanta);

        System.out.print("\n" + "Please, select a drink:" + "\n" +
                "1 - Cola" + "\n"  +  "Price : " + Double.parseDouble(additionalOrder.additionalOrderInfo()) + "\n" +
                "2 - Fanta" + "\n" + "Price : " + Double.parseDouble(additionalOrder1.additionalOrderInfo()) + "\n" );
        int choice = sc.nextInt();
        if(choice == 1) {
            cost = Double.parseDouble(additionalOrder.additionalOrderInfo());
        }
        else if(choice == 2){
            cost = Double.parseDouble(additionalOrder1.additionalOrderInfo());
        }
        System.out.print("Count: ");
//        order.setTotalCost(cost * count);
    }
}

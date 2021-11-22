package Facade;

import Observer.Client;
import Observer.Company;

public class Reception {
    Company antiCafe = new Company();
    Client client = new Client();

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

    public void createRooms(){

    }
}

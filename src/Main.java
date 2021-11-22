import Facade.Reception;
import Strategy.Room;
import Strategy.RoomNo1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Reception reception = new Reception();
        Scanner sc = new Scanner(System.in);

        Room room = new RoomNo1();
        room.aboutFoodRoomType();
        room.aboutGameRoomType();
        room.aboutPSRoomType();
        room.aboutCinemaRoomType();

        for(int i = 0; i < 20; i++){
            System.out.println("1.\n" +
                    "2.\n" +
                    "3.\n" +
                    "4.\n" +
                    "5.\n" +
                    "6. I want to get information about adding new rooms. \n" +
                    "7. Unsubscribe from receiving information about adding new rooms. \n" +
                    "8. Exit from system.");

            int option = sc.nextInt();
            if(option == 1){
                if(!continueMenu()){
                    return;
                }
            } else if(option == 2){
                if(!continueMenu()){
                    return;
                }
            } else if(option == 3){
                if(!continueMenu()){
                    return;
                }
            } else if(option == 4){
                if(!continueMenu()){
                    return;
                }
            } else if(option == 5){
                if(!continueMenu()){
                    return;
                }
            } else if(option == 6){
                System.out.print("Please enter your name: ");
                String name = sc.next();
                reception.createDeleteClient(option, name);
                if(!continueMenu()){
                    return;
                }
            } else if(option == 7){
                System.out.print("Please enter name: ");
                String name = sc.next();
                reception.createDeleteClient(option, name);
                if(!continueMenu()){
                    return;
                }
            } else if(option == 8){
                return;
            }
        }
    }

    public static Boolean continueMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to perform another operation? Y/N");
        String option = sc.next();
        if(option.equals("Y")){
            return true;
        } else {
            return false;
        }
    }
}

package address;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private static List<Data> contact = new ArrayList<Data>();

    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();


        Scanner sc = new Scanner(System.in);
        int menu;
        String choice;

        System.out.println(" 0. Exit. ");
        System.out.println(" 1. Add NewPerson. ");
        System.out.println(" 2. Edit contact. ");
        System.out.println(" 3. Outprint contact. ");
        System.out.println(" 4. Outprint all contacts. ");
        System.out.println(" 5. Delete contact. ");
        menu = sc.nextInt();

        while (menu != 0) {

            switch (menu) {

            case 1:
                while (menu != 2) {
                    System.out.println("Enter First Name: ");
                    String FirstName = sc.next();
                    System.out.println("Enter Last Name: ");
                    String LastName = sc.next();
                    System.out.println("Enter Address: ");
                    String Address = sc.next();
                    System.out.println("Enter City: ");
                    String City = sc.next();
                    System.out.println("Enter State: ");
                    String State = sc.next();
                    System.out.println("Enter ZIPCode: ");
                    String ZIPCode = sc.next();
                    System.out.println("Enter MobileNo: ");
                    String MobileNo = sc.next();
                    
                    contact.add(new Data(FirstName, LastName, Address,City,State,ZIPCode,MobileNo));// Creating a new object and adding it to list
                    System.out.println("Would you like to add someone else? 1: Yes, 2: No");
                    menu = sc.nextInt();
                }
                break;

            case 2:
                System.out.println("Enter First Name of contact that you would like to edit: ");
                int index = sc.nextInt();

                break;
            case 3:
                System.out.println("Enter First Name of contact that you would like to delete: ");
                choice = sc.next();
                break;
            case 4:
                System.out.println(addressBook.contact);
                break;
            case 5:
                System.out.println("Thanks: ");
                choice = sc.next();
                contact.remove(choice);
                break;
            }

            System.out.println(" 0. Exit: ");
            System.out.println(" 1. Add: ");
            System.out.println(" 2. Edit: ");
            System.out.println(" 3. Outprint contact. ");
            System.out.println(" 4. Outprint all contacts. ");
            System.out.println(" 5. Delete: ");
            menu = sc.nextInt();
        }
        System.out.println("Goodbye!");

    }

    private void addPerson(String firstName, String lastName, String Address,String City,String State, String ZIPCode,String MobileNo) {
        Data person = new Data(firstName, lastName, Address,City,State,ZIPCode,MobileNo);
        contact.add(person);
    }
}

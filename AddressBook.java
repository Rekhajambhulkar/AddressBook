import java.util.Scanner;

public class AddressBook2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome in AddressBook");
        

        
        System.out.print("How many Entries create in AddressBook? ");
        int howManyPersons;
        int howManyEntries;

        Person[] library = new Person[5];


        while(true){
            howManyPersons = s.nextInt();
            if (howManyPersons>0){
                library = new Person[howManyPersons];                   //This code decides how many persons are in the array ofAddressbook
                break;
            }
            else System.out.print("You must create 1 entry");
            }



        for (int i=0;i<library.length;i++){


            library[i] = new Person(); //Fixed reference to null because each book in the library had not been initialized yet.

            while(true){
                System.out.print("entries in Addressbook "+i+"? ");
                howManyEntries = s.nextInt();
                if (howManyEntries>0) {
                    library[i].initEntries(howManyEntries);                 //This code decides how many entries are in each book in the library
                    break;
                }
                else System.out.println("You must create at least 1 Entry.");
                }


        }
        boolean done = false;
       int selectedBook =0;
        int selection;
        while (done==false){
        	System.out.println("PersonEntry "+selectedBook+" is currently selected.");

            for (int i = 0;i<library[selectedBook].getEntries();i++){
                System.out.println("---------------Entry "+i+"-----------------");
                library[selectedBook].contents[i].readEntry(); //Accessing the array of entries INSIDE the array of books
                System.out.println("================================");
            }


            System.out.println("Select an option!");
            System.out.println("1. Add an entry");
            System.out.println("2. Remove an entry");
            System.out.println("3. Edit an entry");
            System.out.println("4. Sort all entries in this book");
            System.out.println("5. Select another AddressBook");
            System.out.println("6. Move entry across Addressbooks");
            System.out.println("7. Exit the menu");
            System.out.print("> ");
            selection = s.nextInt();
            String first, last, address, City,State,ZIPCode,MobileNo;
            switch(selection){
            case 1: 
                System.out.print("First name? ");
                first = s.next();
                System.out.print("Last name? ");
                last = s.next();
                System.out.print("Address? ");
                address = s.next();
                System.out.print("City? ");
                City = s.next();
                System.out.print("State? ");
                State = s.next();
                System.out.print("ZIPCode? ");
                ZIPCode = s.next();
                System.out.print("MobileNo? ");
                MobileNo = s.next();
                String regex = "(0/91)?[7-9][0-9]{9}";
                if(MobileNo == regex )
                {
                	System.out.println("Mobile no:+MobileNo");
                }
                else
                {
                	System.out.println("Invalid MobileNo"+MobileNo);
                }
         
                break;
            case 2: 
                System.out.print("Remove which entry? ");
                int entry = s.nextInt();
                library[selectedBook].remove(entry);
                break;
            case 3:
                System.out.print("Edit which entry?");
                int whichEntry = s.nextInt();
                System.out.print("First name? ");
                first = s.next();
                System.out.print("Last name? ");
                last = s.next();
                System.out.print("Address? ");
                address = s.next();
                System.out.print("City? ");
                City = s.next();
                System.out.print("State? ");
                State = s.next();
                System.out.print("ZIPCode? ");
                ZIPCode = s.next();
                System.out.print("MobileNo? ");
                MobileNo = s.next();
                library[selectedBook].edit(first, last, address, City,State,ZIPCode,MobileNo);
                break;
            case 4: 
                System.out.println("Sort alphabetically by which field?");
                System.out.println("1. Sort by first name");
                System.out.println("2. Sort by last name");
                System.out.println("3. Sort by ZIPCode");
            
                library[selectedBook].sort(s.nextInt());
                break;
            //case 5: 
              //  System.out.print("Select which book?");
               // selectedBook = s.nextInt();
               // break;
           // case 6:
                //System.out.print("Move which entry? ");
               // int entryNo = s.nextInt();
               // Book.Entry entryToMove = library[selectedBook].contents[entryNo];
                //library[selectedBook].remove(entryNo);
                //System.out.print("To which book? ");
                //int whichBook = s.nextInt();
                //library[whichBook].addFromCopy(entryToMove);
                //break;
            case 5:
                done = true;
                break;
            default:
                System.out.print("Please choose a valid menu number");


            }

        }
    }
}

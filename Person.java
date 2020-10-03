import java.util.Scanner;

class Person{
    Scanner s = new Scanner(System.in);

    class Entry{
        private String first;
        private String last;
        private String address;
        private String City;
        private String State;
        private String ZIPCode;
        private String MobileNo;
        
        Entry(String first, String last, String address, String city,String State,String ZIPCode,String MobileNo){
            this.first = first;
            this.last = last;
            this.address = address;
            this.City = city;
            this.State = State;
            this.ZIPCode = ZIPCode;
            this.MobileNo = MobileNo;

        }
        Entry(){
            first = "";
            last = "";
            address = "";
            City = "";
            State = "";
            ZIPCode = "";
            MobileNo = "";
            
        }
        public void readEntry(){
            System.out.println("First Name:"+first );
            System.out.println("Last Name:"+last );
            System.out.println("Address:"+address );
            System.out.println("City:"+City );
            System.out.println("State:"+State );
            System.out.println("ZIPCode:"+ZIPCode );
            System.out.println("MobileNo:"+MobileNo );
        }
    }


    //Keeps track of how many entries are in the book
    private int entries = 0;
    Entry[] contents;
    public void initEntries(int e){
        contents = new Entry[e];
        for (int i = 0;i<contents.length;i++){      //Initializes an array of entries, then loops through to initialize each individual entry
            contents[i] = new Entry();
        }
    }
    public int getEntries(){
        return contents.length;
    }
    //Adds an entry to the book
    public void add(String first, String last, String address, String city, String State, String ZIPCode, String MobileNo){
        if (entries<contents.length){
        contents[entries] = new Entry(first, last, address, city,State,ZIPCode,MobileNo);
        entries++;
        }
        else System.out.println("Error: addressbook is full");
    }

    
    //Removes an entry from the book
    public void remove(int entry){
        if (entries>1){
            contents[entry] = new Entry();
            for (int i = 0;i<entries-entry;i++){
                if (entry+1==entries) contents[entry] = new Entry();
                else{
                    Entry temp = contents[entry+i];
                    contents[entry+i] = contents[entry+i+1]; //Removes an entry end moves each entry after it one backwards.
                    contents[entry+i+1] = temp;
                }
            }
            entries++;
            }
            else System.out.println("Error: book is empty.");
    }

    //Changes the values of an entry
    public void edit(String first, String last, String address, String City, String State,String ZIPCode,String MobileNo){
        int selection = 0;
        
		contents[selection].first = first;
        contents[selection].last = last;
        contents[selection].address = address;
        contents[selection].City = City;
        contents[selection].State = State;
        contents[selection].ZIPCode = ZIPCode;
        contents[selection].MobileNo = MobileNo;

        

    }

    
    //Sorts the book based on a part of the entry
    //int n is used to tell which part of the entries to base the sort on
    public void sort(int n){
        for(int i = 0;i<contents.length;i++){
            for (int j = 0;j<contents.length;j++){
                switch(n){
                    case 1:
                        if (contents[i].first.compareTo(contents[j].first)<0){
                            Entry temp = contents[i];
                            contents[i] = contents[j];
                            contents[j] = temp;
                        }
                        break;
                    case 2:
                        if (contents[i].last.compareTo(contents[j].last)<0){
                            Entry temp = contents[i];
                            contents[i] = contents[j];
                            contents[j] = temp;
                        }
                        break;
                    case 3:
                        if (contents[i].ZIPCode.compareTo(contents[j].address)<0){
                            Entry temp = contents[i];
                            contents[i] = contents[j];
                            contents[j] = temp;
                        }
                        break;
                    
                    default: 
                        System.out.println("Error: invalid field");
                        break;
                }
            }
        }
    }
    public void addFromCopy(Entry e){
        if (entries<contents.length){
            contents[entries] = e;
            entries++;
            }
            else System.out.println("Error: Addressbook is full");
    }

}


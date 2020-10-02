package address;

public class Person {
    private String firstName = null;
    private String lastName = null;
    private String Address = null;
    private String City = null;
    private String State = null;
    private String  ZIPCode= null;
    private String MobileNo = null;


    public Person(String firstName, String lastName, String Address,String City,String State, String ZIPCode,String MobileNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Address=Address;
    	this.City=City;
    	this.State=State;
    	this.ZIPCode=ZIPCode;
    	this.MobileNo=MobileNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress()
    {
         return Address;
    }
    public void setAddress(String address) {
    	this.Address = Address;
    }
    public String getCity()
    {
         return City;
    }
    public String getState()
    {
         return State;
    }
    public void setState(String state) {
    	this.State = state;
    }
    public String getZIPCode() {
    	return ZIPCode;
    }
    public void setZIPCode(String ZIPCode) {
    	this.ZIPCode = ZIPCode;
    }
    public void setCity(String City) {
    	this.City = City;
    }
    public void setMobileNo(String MobileNo) {
    	this.MobileNo = MobileNo;
    }


    public String toString() {
        return String.format(firstName+" "+lastName+" "+Address+""+City+""+State+" "+ZIPCode+" "+MobileNo);
    }
}


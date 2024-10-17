public class Contact {

    private String fname;

    private String lname;
    private String email;

    @Override
    public String toString() {
        return "Contact{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", zipcode=" + zipcode +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", phonenumber=" + phonenumber +
                '}';
    }

    private long zipcode;

    private String city;
    private String state;
    private long phonenumber;
    public Contact(String fname, String lname, String email, String city, String state, long phonenumber, long zipcode) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.city = city;
        this.zipcode = zipcode;
        this.state = state;
        this.phonenumber = phonenumber;
    }

    // this class ko pojo class bolte hai
    // pojo full form => Plam old java object
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public long getZipcode() {
        return zipcode;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }


}

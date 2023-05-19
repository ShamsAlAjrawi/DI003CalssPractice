package ClassModeling;

//Model a house as if the class were to be part of a GPS mapping system
public class House {
//    using encapsulation by making the variables private
    private int houseNum;
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;
    boolean isABusiness;


//   default constructor & parameterized constructors
    House () {

    }

    public House(int houseNum, String streetAddress, String city, String state, String zipcode) {
        this.houseNum = houseNum;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public House(boolean isABusiness) {
        this.isABusiness = isABusiness;
    }

//    method
    public void fullAddress (int houseNum, String streetAddress, String city, String state, String zipcode){
        System.out.println(houseNum + " " + streetAddress + " " + city + " " + state + " " + zipcode);
    }


//    getter & setters:

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
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

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public boolean isABusiness() {
        return isABusiness;
    }

    public void setABusiness(boolean ABusiness) {
        isABusiness = ABusiness;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseNum=" + houseNum +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", isABusiness=" + isABusiness +
                '}';
    }
}

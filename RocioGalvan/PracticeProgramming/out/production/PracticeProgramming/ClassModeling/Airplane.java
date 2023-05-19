package ClassModeling;

//Model an airplane as if the class were to be part of an air traffic control system
public class Airplane {
    private String arrivalTime;
    private String planeNum;
    private String arrivingFromAirportName;
    private String gateLandingAt;
    private boolean arrivedOnTime;
    private boolean arrivedLate;
    private boolean arrivedEarly;
    private int numOfPassengers;
    private int numOfCrew;
    private String nameOfPilot;
    private int pilotLicenseNum;
    private String nameOfCoPilot;
    private int coPilotLicenseNum;
    private String[] namesOfCrewOnBoard;
    private String[] namesOfPassengersOnBoard;

    public Airplane() {
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getPlaneNum() {
        return planeNum;
    }

    public void setPlaneNum(String planeNum) {
        this.planeNum = planeNum;
    }

    public String getArrivingFromAirportName() {
        return arrivingFromAirportName;
    }

    public void setArrivingFromAirportName(String arrivingFromAirportName) {
        this.arrivingFromAirportName = arrivingFromAirportName;
    }

    public String getGateLandingAt() {
        return gateLandingAt;
    }

    public void setGateLandingAt(String gateLandingAt) {
        this.gateLandingAt = gateLandingAt;
    }

    public boolean isArrivedOnTime() {
        return arrivedOnTime;
    }

    public void setArrivedOnTime(boolean arrivedOnTime) {
        this.arrivedOnTime = arrivedOnTime;
    }

    public boolean isArrivedLate() {
        return arrivedLate;
    }

    public void setArrivedLate(boolean arrivedLate) {
        this.arrivedLate = arrivedLate;
    }

    public boolean isArrivedEarly() {
        return arrivedEarly;
    }

    public void setArrivedEarly(boolean arrivedEarly) {
        this.arrivedEarly = arrivedEarly;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public int getNumOfCrew() {
        return numOfCrew;
    }

    public void setNumOfCrew(int numOfCrew) {
        this.numOfCrew = numOfCrew;
    }

    public String getNameOfPilot() {
        return nameOfPilot;
    }

    public void setNameOfPilot(String nameOfPilot) {
        this.nameOfPilot = nameOfPilot;
    }

    public int getPilotLicenseNum() {
        return pilotLicenseNum;
    }

    public void setPilotLicenseNum(int pilotLicenseNum) {
        this.pilotLicenseNum = pilotLicenseNum;
    }

    public String getNameOfCoPilot() {
        return nameOfCoPilot;
    }

    public void setNameOfCoPilot(String nameOfCoPilot) {
        this.nameOfCoPilot = nameOfCoPilot;
    }

    public int getCoPilotLicenseNum() {
        return coPilotLicenseNum;
    }

    public void setCoPilotLicenseNum(int coPilotLicenseNum) {
        this.coPilotLicenseNum = coPilotLicenseNum;
    }

    public String[] getNamesOfCrewOnBoard() {
        return namesOfCrewOnBoard;
    }

    public void setNamesOfCrewOnBoard(String[] namesOfCrewOnBoard) {
        this.namesOfCrewOnBoard = namesOfCrewOnBoard;
    }

    public String[] getNamesOfPassengersOnBoard() {
        return namesOfPassengersOnBoard;
    }

    public void setNamesOfPassengersOnBoard(String[] namesOfPassengersOnBoard) {
        this.namesOfPassengersOnBoard = namesOfPassengersOnBoard;
    }
}

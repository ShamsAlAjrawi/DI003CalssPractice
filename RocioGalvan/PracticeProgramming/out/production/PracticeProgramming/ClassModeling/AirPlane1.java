package ClassModeling;

//Model an airplane as if the class were to be part of a flight simulator.
public class AirPlane1 {
    private String styleOfPlane;
    private String takeOffLocation;
    private String destinationLocation;
    private String nameOfPilot;
    private boolean isPlaneOn;
    private Long minMPHReached;
    private Long maxMPHReached;
    private Long averageMPHReached;
    private double minAltitude;
    private double maxAltitude;
    private double averageAltitude;
    private double timeInAir;

    public AirPlane1() {
    }

    public String getStyleOfPlane() {
        return styleOfPlane;
    }

    public void setStyleOfPlane(String styleOfPlane) {
        this.styleOfPlane = styleOfPlane;
    }

    public String getTakeOffLocation() {
        return takeOffLocation;
    }

    public void setTakeOffLocation(String takeOffLocation) {
        this.takeOffLocation = takeOffLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public String getNameOfPilot() {
        return nameOfPilot;
    }

    public void setNameOfPilot(String nameOfPilot) {
        this.nameOfPilot = nameOfPilot;
    }

    public boolean isPlaneOn() {
        return isPlaneOn;
    }

    public void setPlaneOn(boolean planeOn) {
        isPlaneOn = planeOn;
    }

    public Long getMinMPHReached() {
        return minMPHReached;
    }

    public void setMinMPHReached(Long minMPHReached) {
        this.minMPHReached = minMPHReached;
    }

    public Long getMaxMPHReached() {
        return maxMPHReached;
    }

    public void setMaxMPHReached(Long maxMPHReached) {
        this.maxMPHReached = maxMPHReached;
    }

    public Long getAverageMPHReached() {
        return averageMPHReached;
    }

    public void setAverageMPHReached(Long averageMPHReached) {
        this.averageMPHReached = averageMPHReached;
    }

    public double getMinAltitude() {
        return minAltitude;
    }

    public void setMinAltitude(double minAltitude) {
        this.minAltitude = minAltitude;
    }

    public double getMaxAltitude() {
        return maxAltitude;
    }

    public void setMaxAltitude(double maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public double getAverageAltitude() {
        return averageAltitude;
    }

    public void setAverageAltitude(double averageAltitude) {
        this.averageAltitude = averageAltitude;
    }

    public double getTimeInAir() {
        return timeInAir;
    }

    public void setTimeInAir(double timeInAir) {
        this.timeInAir = timeInAir;
    }
}

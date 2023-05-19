package ClassModeling;

//Model ice cream as if the class were to be part of the control system at the dairy that makes the ice cream
public class IceCream {
    private String flavor;
    private boolean passedInspection;
    private String nameOfInspector;
    private String dateOfInspection;
    private int inspectionGrade;

    public IceCream () {

    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public boolean isPassedInspection() {
        return passedInspection;
    }

    public void setPassedInspection(boolean passedInspection) {
        this.passedInspection = passedInspection;
    }

    public String getNameOfInspector() {
        return nameOfInspector;
    }

    public void setNameOfInspector(String nameOfInspector) {
        this.nameOfInspector = nameOfInspector;
    }

    public String getDateOfInspection() {
        return dateOfInspection;
    }

    public void setDateOfInspection(String dateOfInspection) {
        this.dateOfInspection = dateOfInspection;
    }

    public int getInspectionGrade() {
        return inspectionGrade;
    }

    public void setInspectionGrade(int inspectionGrade) {
        this.inspectionGrade = inspectionGrade;
    }
}

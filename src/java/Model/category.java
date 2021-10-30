package Model;
public class category {
    private String cID;
    private String cName;
    private String cDescription;

    public category(String cID, String cName, String cDescription) {
        this.cID = cID;
        this.cName = cName;
        this.cDescription = cDescription;
    }

    public String getcID() {
        return cID;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcDescription() {
        return cDescription;
    }

    public void setcDescription(String cDescription) {
        this.cDescription = cDescription;
    }

    @Override
    public String toString() {
        return "category{" + "cID=" + cID + ", cName=" + cName + ", cDescription=" + cDescription + '}';
    }
    
    
}

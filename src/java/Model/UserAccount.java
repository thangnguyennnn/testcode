package Model;
public class UserAccount {
    private String maThe;
    private String tk;
    private String mk;
    private String isAdmin;

    public UserAccount(String maThe, String tk, String mk, String isAdmin) {
        this.maThe = maThe;
        this.tk = tk;
        this.mk = mk;
        this.isAdmin = isAdmin;
    }

    public String getMaThe() {
        return maThe;
    }

    public void setMaThe(String maThe) {
        this.maThe = maThe;
    }

    public String getTk() {
        return tk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "UserAccount{" + "maThe=" + maThe + ", tk=" + tk + ", mk=" + mk + ", isAdmin=" + isAdmin + '}';
    }
    
    
}

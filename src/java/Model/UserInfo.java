package Model;
public class UserInfo {
    private String tk;
    private String hoten;
    private String sdt;
    private String email;
    private String diaChi;
    private String anhCMND;

    public UserInfo(String tk, String hoten, String sdt, String email, String diaChi, String anhCMND) {
        this.tk = tk;
        this.hoten = hoten;
        this.sdt = sdt;
        this.email = email;
        this.diaChi = diaChi;
        this.anhCMND = anhCMND;
    }

    
    public String getTk() {
        return tk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getAnhCMND() {
        return anhCMND;
    }

    public void setAnhCMND(String anhCMND) {
        this.anhCMND = anhCMND;
    }

    @Override
    public String toString() {
        return "UserInfo{" + "tk=" + tk + ", hoten=" + hoten + ", sdt=" + sdt + ", email=" + email + ", diaChi=" + diaChi + ", anhCMND=" + anhCMND + '}';
    }
    
    
}

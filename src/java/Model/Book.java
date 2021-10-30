package Model;
public class Book {
    private String bookID;
    private String tenSach;
    private String tacGia;
    private String theLoai;
    private String ngayXB;
    private String luotMuon;
    private String thoiGianMuon;
    private String anhMH;
    private String anhMH1;
    private String anhMH2;
    private String anhMH3;

    public Book(String bookID, String tenSach, String tacGia, String theLoai, String ngayXB, String luotMuon, String thoiGianMuon, String anhMH, String anhMH1, String anhMH2, String anhMH3) {
        this.bookID = bookID;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.ngayXB = ngayXB;
        this.luotMuon = luotMuon;
        this.thoiGianMuon = thoiGianMuon;
        this.anhMH = anhMH;
        this.anhMH1 = anhMH1;
        this.anhMH2 = anhMH2;
        this.anhMH3 = anhMH3;
    }

    public String getAnhMH1() {
        return anhMH1;
    }

    public void setAnhMH1(String anhMH1) {
        this.anhMH1 = anhMH1;
    }

    public String getAnhMH2() {
        return anhMH2;
    }

    public void setAnhMH2(String anhMH2) {
        this.anhMH2 = anhMH2;
    }

    public String getAnhMH3() {
        return anhMH3;
    }

    public void setAnhMH3(String anhMH3) {
        this.anhMH3 = anhMH3;
    }

    

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getNgayXB() {
        return ngayXB;
    }

    public void setNgayXB(String ngayXB) {
        this.ngayXB = ngayXB;
    }

    public String getLuotMuon() {
        return luotMuon;
    }

    public void setLuotMuon(String luotMuon) {
        this.luotMuon = luotMuon;
    }

    public String getThoiGianMuon() {
        return thoiGianMuon;
    }

    public void setThoiGianMuon(String thoiGianMuon) {
        this.thoiGianMuon = thoiGianMuon;
    }

    public String getAnhMH() {
        return anhMH;
    }

    public void setAnhMH(String anhMH) {
        this.anhMH = anhMH;
    }

    @Override
    public String toString() {
        return "Book{" + "bookID=" + bookID + ", tenSach=" + tenSach + ", tacGia=" + tacGia + ", theLoai=" + theLoai + ", ngayXB=" + ngayXB + ", luotMuon=" + luotMuon + ", thoiGianMuon=" + thoiGianMuon + ", anhMH=" + anhMH + ", anhMH1=" + anhMH1 + ", anhMH2=" + anhMH2 + ", anhMH3=" + anhMH3 + '}';
    }

   
    
    
    
}

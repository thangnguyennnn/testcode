package DAO;

import ConnectDB.DBContext;
import Model.Book;
import Model.UserAccount;
import Model.UserInfo;
import Model.category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Dao {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    
    // KIểm tra mk có đúng form không
    public boolean checkPass(String pass){
        String pattern = "^[A-z][A-z0-9]{1,}";
        if(pass.length() >= 8){
            return pass.matches(pattern);
        }else return false;
    }
    
    
    //Lấy danh sách người dùng
    public List<UserAccount> getListUserAccount(){
        try {
            List<UserAccount> list = new ArrayList<>();
            String sql = "select * from Tai_Khoan order by maThe";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new UserAccount(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }
    
    
    //Tạo mã thẻ tự động cho mỗi người dùng 
    public String creatMaTheforUser(){
        List l = getListUserAccount();
        return l.size() + 1 + "";
    }
    
    
    // Lấy danh sách thông tin người dùng
    public List<UserInfo> getListUserInfo(){
        try {
            List<UserInfo> list = new ArrayList<>();
            String sql = "select * from Thong_Tin_User";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new UserInfo(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }
    
    
    // Kiểm tra tài khoản
    public boolean checkTKExist(String TK){
        List<UserInfo> list = getListUserInfo();
        for (UserInfo u : list) {
            if(TK.equals(u.getTk())){
                return true;
            }
        }
        return false;
    }
    
    //Kiểm tra email
    public boolean checkEmailExist(String Email){
        List<UserInfo> list = getListUserInfo();
        for (UserInfo u : list) {
            if(Email.equals(u.getEmail())){
                return true;
            }
        }
        return false;
    }
    
    
    // Thêm người dùng
    public boolean addAccount(UserAccount a){
        try {
            String sql = "Insert into Tai_Khoan values (?,?,?,?)";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, a.getMaThe());
            ps.setString(2, a.getTk());
            ps.setString(3, a.getMk());
            ps.setString(4, a.getIsAdmin());
            int n = ps.executeUpdate();
            if(n > 0) return true;
        } catch (Exception e) {
        }
        return false;
    }
    
    
    // Thêm thông tin người dùng
    public boolean addUserInfo(UserInfo uf){
        try {
            String sql = "Insert into Thong_Tin_User values (?,?,?,?,?,?)";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, uf.getTk());
            ps.setString(2, uf.getHoten());
            ps.setString(3, uf.getSdt());
            ps.setString(4, uf.getEmail());
            ps.setString(5, uf.getDiaChi());
            ps.setString(6, uf.getAnhCMND());
            int n = ps.executeUpdate();
            if(n > 0) return true;
        } catch (Exception e) {
        }
        return false;
    }
    
    
    // Kiểm tra đăng nhập
    public boolean checkLogin(String username, String password){
        try {
            String sql = "select * from [Tai_Khoan] where TK = ? and MK = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs =  ps.executeQuery();
            while (rs.next()) {                
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    
    
    // Lấy tài khoản hiện đang đăng nhập
    public UserAccount getAccLogining(String username){
        try {
            String sql = "select * from Tai_Khoan where TK = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            rs =  ps.executeQuery();
            while (rs.next()) {                
                return new UserAccount(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    
    // Lấy thông tin người dùng thông qua username
    public UserInfo getInfoUser(String username){
        try {
            String sql = "select * from Thong_Tin_User where TK = ?";
            con = new DBContext().getConnection();
            ps= con.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while(rs.next()){
                return new UserInfo(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    
    // Lưu thông tin người dùng
    public boolean saveUserInfo(UserInfo d){
        try {
            String sql = "Update Thong_Tin_User set HoTen = ?, sdt = ?, email = ?, diaChi = ?, anhCMND = ? where TK = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, d.getHoten());
            ps.setString(2, d.getSdt());
            ps.setString(3, d.getEmail());
            ps.setString(4, d.getDiaChi());
            ps.setString(5, d.getAnhCMND());
            ps.setString(6, d.getTk());
            int n = ps.executeUpdate();
            if(n > 0) return true;
        } catch (Exception e) {
        }
        return false;
    }
    //Thêm sách
    public boolean addBook(Book b){ 
        try {
            String sql = "Insert into Book values (?,?,?,?,?,?,?,?,?,?,?)";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, b.getBookID());
            ps.setString(2, b.getTenSach());
            ps.setString(3, b.getTacGia());
            ps.setString(4, b.getTheLoai());
            ps.setString(5, b.getNgayXB());
            ps.setString(6, b.getLuotMuon());
            ps.setString(7, b.getThoiGianMuon());
            ps.setString(8, b.getAnhMH());
            ps.setString(9, b.getAnhMH1());
            ps.setString(10, b.getAnhMH2());
            ps.setString(11, b.getAnhMH3());
            int n = ps.executeUpdate();
            if(n>0) return true;
        } catch (Exception e) {
        }
        return false;
    }
    
    // Lấy danh sách thể loại
    public List<category> getListCategory(){
        try {
            List<category> list = new ArrayList<>();
            String sql = "select * from The_Loai";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new category(rs.getString(1), rs.getString(2), rs.getString(3)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }
    
    public List<Book> getListBook(){
        try {
            List<Book> list = new ArrayList<>();
            String sql = "select * from Book order by Ma_Sach ";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new Book(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }
    
    //Tạo mã sach tự động 
    public String creatBookID(){
        List l = getListBook();
        return l.size()+ 1 + "";
    }
    
    //Tạo mã thể loại tự động 
    public String creatCateID(){
        List l = getListCategory();
        return l.size()+ 1 + "";
    }
    
    public boolean addCategory(category c){
        try {
            String sql = "Insert into The_Loai values (?,?,?)";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getcID());
            ps.setString(2, c.getcName());
            ps.setString(3, c.getcDescription());
            int n = ps.executeUpdate();
            if(n> 0 ) return true;
        } catch (Exception e) {
        }
        return false;
    }
    
    // lấy sách bơi id
    public Book getBookByID(String bookID){
        try {
            String sql ="select * from Book where Ma_Sach = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, bookID);
            rs = ps.executeQuery();
            while(rs.next()){
                return new Book(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public String getNameCate(String cateID){
        try {
            String sql = "  select The_Loai.Ten_Te_Loai from The_Loai where Ma_The_Loai = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cateID);
            rs = ps.executeQuery();
            while(rs.next()){
                return rs.getString(1);
            }
        } catch (Exception e) {
        }
        return "";
    }
    
    public boolean updateBook(Book b){
        try {
            String sql = "Update Book set Ten_Sach = ?,\n" +
"                    Ten_Tac_Gia = ?,\n" +
"                    Ma_The_Loai = ?,\n" +
"                    Ngay_Xuat_Ban = ?,\n" +
"                    Luot_Muon = ?,\n" +
"                    Thoi_Gian_Muon = ?,\n" +
"                    Book_img1 = ?,\n" +
"                    Book_img2 = ?,\n" +
"                    Book_img3 = ?,\n" +
"                    Book_img4 = ?\n" +
"                    where Ma_Sach = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, b.getTenSach());
            ps.setString(2, b.getTacGia());
            ps.setString(3, b.getTheLoai());
            ps.setString(4, b.getNgayXB());
            ps.setString(5, b.getLuotMuon());
            ps.setString(6, b.getThoiGianMuon());
            ps.setString(7, b.getAnhMH());
            ps.setString(8, b.getAnhMH1());
            ps.setString(9, b.getAnhMH2());
            ps.setString(10, b.getAnhMH3());
            ps.setString(11, b.getBookID());
            int n = ps.executeUpdate();
            if(n > 0) return true;
        } catch (Exception e) {
        }
        return false;
    }
    
    public UserAccount getUserAccount(String tk){
        try {
             String sql = "select * from Tai_khoan where TK = ?";
             con = new DBContext().getConnection();
             
             ps = con.prepareStatement(sql);
             ps.setString(1, tk);
             rs = ps.executeQuery();
             
             while (rs.next())
                 return new UserAccount(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
        } catch (Exception e) {
        }
        return null;
    }
    
    public boolean add_remove_Admin(UserAccount u){
        try {
            String sql = "update Tai_Khoan set isAdmin = ? where maThe = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, u.getIsAdmin());
            ps.setString(2, u.getMaThe());
            int n = ps.executeUpdate();
            if(n>0)return true;
        } catch (Exception e) {
        }
        return false;
    }
    
    // Hàm main
    public static void main(String[] args) {
        Dao d = new Dao();
        
//        List<UserInfo> list = d.getListUserInfo();
//        for (UserInfo userInfo : list) {
//            System.out.println(userInfo);
//        }
//        
//        System.out.println(d.checkLogin("thangnhde150387@fpt.edu.vn", "ht24052001"));
//        
//        System.out.println(d.checkEmailExist("thangnhde150387@fpt.edu.vn"));
//        
//        System.out.println(d.checkPass("123iu"));
//        
//        UserInfo u = new UserInfo("DE1501387", "Trần Thành An", "0123456789", "thang24052001@gmail.com", "HCM", "null");
//        System.out.println(d.saveUserInfo(u));
        
//        String username = "DE150983";
//        String password = "hobaocaochon12";
//        String rePass = "hobaocaochon12";
//        String email = "emkhongsi@gmail.com";
//        
//        UserAccount a = new UserAccount("3",username,password, "0");
//        
//        //System.out.println(d.addAccount(a));
//        System.out.println(d.checkTKExist(username));
//        System.out.println(d.checkEmailExist(email));
//        System.out.println(d.checkPass(password));
//        System.out.println(d.creatCateID());

//        List<Book> l = d.getListBook();
//        for (Book book : l) {
//            System.out.println(book);
//        }

//        Book b = new Book("3", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2");
        
        
        System.out.println(d.getInfoUser("ngay24052001"));
    }
}

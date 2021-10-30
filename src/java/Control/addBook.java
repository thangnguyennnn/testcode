package Control;

import DAO.Dao;
import Model.Book;
import Model.UserAccount;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@MultipartConfig
public class addBook extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("loadAddBookPage").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        try {
            Dao d = new Dao();
            HttpSession session = request.getSession(true);
            UserAccount u = (UserAccount) session.getAttribute("Logining");
            String a = ""+session.getAttribute("isAdmin");
            
            String ID = d.creatBookID();
            String bookName = request.getParameter("tenSach");
            String author = request.getParameter("tacGia");
            String cateID = request.getParameter("cate");
            String ngayXB = request.getParameter("ngayXB");
            String luotMuon = request.getParameter("luotMuon");
            String soNgayChoPhep = request.getParameter("sncpm");
            
            Part pt1 = request.getPart("photoBook1");
            Part pt2 = request.getPart("photoBook2");
            Part pt3 = request.getPart("photoBook3");
            Part pt4 = request.getPart("photoBook4");
            
            String password = request.getParameter("T_Pass");        

            if(password.equals(u.getMk())){
                String realPath = "D:\\FPTU\\Fall2021\\JAVAWEB\\code\\PRJ_FA21\\web\\bookImages";
                String filename,filename2,filename3,filename4;
                filename = Paths.get(pt1.getSubmittedFileName()).getFileName().toString();
                filename2 = Paths.get(pt2.getSubmittedFileName()).getFileName().toString();
                filename3 = Paths.get(pt3.getSubmittedFileName()).getFileName().toString();
                filename4 = Paths.get(pt4.getSubmittedFileName()).getFileName().toString();
                
                if(!Files.exists(Paths.get(realPath))){
                    Files.createDirectories(Paths.get(realPath));
                }                 
                
                String namefile1 = "";
                String namefile2 = "";
                String namefile3 = "";
                String namefile4 = "";
                
                if(!filename.equals("")){
                    pt1.write(realPath+"/"+filename);
                    namefile1 = "bookImages/"+filename;
                }
                if(!filename2.equals("")){
                    pt2.write(realPath+"/"+filename2);
                    namefile2 = "bookImages/"+filename2;
                }
                if(!filename3.equals("")){
                    pt3.write(realPath+"/"+filename3);
                    namefile3 = "bookImages/"+filename3;
                }
                if(!filename4.equals("")){
                    pt4.write(realPath+"/"+filename4);
                    namefile4 = "bookImages/"+filename4;
                }
                
                Book book = new Book(ID, bookName, author, cateID, ngayXB, luotMuon, soNgayChoPhep,namefile1,namefile2,namefile3,namefile4);
                boolean addBook = d.addBook(book);
                request.setAttribute("addBook", addBook);
                
            }else{
                request.setAttribute("addBook", false);
            }
        
        } catch (Exception e) {
        }
        request.getRequestDispatcher("loadManagerBookPage").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

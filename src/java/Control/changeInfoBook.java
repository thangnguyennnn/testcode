package Control;

import DAO.Dao;
import Model.Book;
import Model.UserAccount;
import java.io.IOException;
import java.io.PrintWriter;
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
public class changeInfoBook extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
            
            
            String ID = request.getParameter("bookID");
            String bookName = request.getParameter("tenSach");
            String author = request.getParameter("tacGia");
            String cateID = request.getParameter("cate");
            String ngayXB = request.getParameter("ngayXB");
            String luotMuon = request.getParameter("luotmuon");
            String soNgayChoPhep = request.getParameter("tg");
            
            Part pt1 = request.getPart("photo1");
            Part pt2 = request.getPart("photo2");
            Part pt3 = request.getPart("photo3");
            Part pt4 = request.getPart("photo4");
            
            Book b = d.getBookByID(ID);
            
            String password = request.getParameter("UB_Pass");        

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
                
                String namefile1 = b.getAnhMH();
                String namefile2 = b.getAnhMH1();
                String namefile3 = b.getAnhMH2();
                String namefile4 = b.getAnhMH3();
                
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
                boolean addBook = d.updateBook(book);
                request.setAttribute("checkUpdateBook", addBook);
                
            }else{
                request.setAttribute("checkUpdateBook", false);
            }
            request.getRequestDispatcher("loadViewInfoBookPage?bookID="+ID).forward(request, response);
        } catch (Exception e) {
        }
        
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

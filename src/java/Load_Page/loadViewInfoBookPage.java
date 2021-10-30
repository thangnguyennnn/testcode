package Load_Page;

import DAO.Dao;
import Model.Book;
import Model.UserAccount;
import Model.category;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class loadViewInfoBookPage extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session = request.getSession(true);
        UserAccount u = (UserAccount) session.getAttribute("Logining");
        String admin = session.getAttribute("isAdmin")+"";
        String bookID = request.getParameter("bookID");
        
        Dao d = new Dao();
        
        if(admin.equals("1") && u != null){
            List<category> listC = d.getListCategory();
            request.setAttribute("listC", listC);
            Book b = d.getBookByID(bookID);
            request.setAttribute("book", b);
            request.setAttribute("cateName", d.getNameCate(b.getTheLoai()));
            request.getRequestDispatcher("viewInfoBook.jsp").forward(request, response);
        }
        else{
            request.getRequestDispatcher("404.jsp").forward(request, response);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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

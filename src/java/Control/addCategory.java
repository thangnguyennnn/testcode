package Control;

import DAO.Dao;
import Model.UserAccount;
import Model.category;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class addCategory extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        
        HttpSession session = request.getSession(true);
        UserAccount u = (UserAccount)session.getAttribute("Logining");
        String a = ""+session.getAttribute("isAdmin");
        String pass = request.getParameter("AC_Pass");
        Dao d = new Dao();
        
        if(u != null && a.equals("1")){
            if(pass.equals(u.getMk())){
                String cateID = d.creatCateID();
                String cateName = request.getParameter("cateName");
                String cateDescreiption = request.getParameter("description");

                category c = new category(cateID, cateName, cateDescreiption);
                boolean addCategory = d.addCategory(c);
                request.setAttribute("addCategory", addCategory);
            }else{
                request.setAttribute("addCategory", false);
            }
            request.getRequestDispatcher("loadAddCatePage").forward(request, response);

        }else{
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

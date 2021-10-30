package Control;

import DAO.Dao;
import Model.UserAccount;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class addAdmin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(true);
        UserAccount u = (UserAccount) session.getAttribute("Logining");
        String a = ""+session.getAttribute("isAdmin");
        String pass = request.getParameter("CA_Pass");
        Dao d = new Dao();
        
        if(a.equals("1") && u != null){
            
            UserAccount ua = (UserAccount)session.getAttribute("account");
            if(pass.equals(u.getMk())){
                String action = request.getParameter("btAction");
                if(action.equals("add")){
                    ua.setIsAdmin("1");
                    boolean checkAddAdmin = d.add_remove_Admin(ua);
                    request.setAttribute("checkAddAdmin", checkAddAdmin);
                }
                if(action.equals("remove")){
                    ua.setIsAdmin("0");
                    boolean check_remove = d.add_remove_Admin(ua);
                    request.setAttribute("check_remove", check_remove);
                }
            }else{
                request.setAttribute("checkPass", false);
            }
            request.getRequestDispatcher("loadViewInfoUserPage?usernameview="+ua.getTk()).forward(request, response);
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

package Control;

import DAO.Dao;
import Model.UserAccount;
import Model.UserInfo;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class signup extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        Dao d = new Dao();
                
        String maThe = d.creatMaTheforUser();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String rePass = request.getParameter("cofirm");
        String email = request.getParameter("email");


        if(!d.checkTKExist(username) && !d.checkEmailExist(email) && d.checkPass(password) && password.equals(rePass)){
            UserAccount a = new UserAccount(maThe,username,password, "0");
            boolean checkAA = d.addAccount(a);
            if(checkAA){
                UserInfo uf = new UserInfo(username, username, "", email, "", "images/nguoidung.jpg");
                d.addUserInfo(uf);
                request.getRequestDispatcher("login?L_username="+username+"&L_password="+password).forward(request, response);
            }else{
                //request.setAttribute("checkAdd", checkAA);
                request.getRequestDispatcher("loadLoginPage").forward(request, response);
            }
        }else{
            request.setAttribute("checkAdd", false);
            request.getRequestDispatcher("loadLoginPage").forward(request, response);
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

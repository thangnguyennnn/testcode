package Control;

import DAO.Dao;
import Model.UserAccount;
import Model.UserInfo;
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
public class changeInfo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("loadManagerInfo").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        try {
            Dao d = new Dao();
            HttpSession session = request.getSession(true);
            UserAccount a = (UserAccount)session.getAttribute("Logining");
        
            String username = a.getTk();
            String name = request.getParameter("hoten");
            String phone = request.getParameter("sdt");
            String email = request.getParameter("em");
            String address = request.getParameter("diaChi");
            Part part = request.getPart("photo");
            String password = request.getParameter("C_Pass");        

            if(password.equals(a.getMk())){
                String realPath = "D:\\FPTU\\Fall2021\\JAVAWEB\\code\\PRJ_FA21\\web\\images";
                String filename;
                filename = Paths.get(part.getSubmittedFileName()).getFileName().toString();
                
                if(!Files.exists(Paths.get(realPath))){
                    Files.createDirectories(Paths.get(realPath));
                }
                part.write(realPath+"/"+filename);
                
                UserInfo u = new UserInfo(username, name, phone, email, address, "images/"+filename);
                boolean checkSave = d.saveUserInfo(u);
                request.setAttribute("checkUpdate", checkSave);
                
            }else{
                request.setAttribute("checkUpdate", false);
            }
        
        } catch (Exception e) {
        }
        request.getRequestDispatcher("loadManagerInfo").forward(request, response);
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

package control;

import java.io.IOException;
import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.LoginBean;
import beans.RegisterBean;
import model.UserDb;

/**
 * Servlet implementation class LoginUser
 */
@WebServlet("/LoginUser")
public class LoginUser extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginUser() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);

        try {

            String email = request.getParameter("E-mail");
            String password = request.getParameter("senha");

            LoginBean user = new LoginBean();
            user.setEmail(email);
            BigInteger cript;
            cript = RegisterBean.Criptografarsenha(password);
            user.setSenha(cript.toString());

            UserDb dp = new UserDb();
            ResultSet s1 = dp.autenticacaoUsuario(user);

            if (s1.next()) {
                response.sendRedirect("http://localhost:8080/javaWebapplication/webapp/jsp/index4.jsp");
                System.out.println("Usuario encontrado");
            } else {
                response.sendRedirect("http://localhost:8080/javaWebapplication/webapp/jsp/index3.jsp");
                System.out.println("Usuario não encontrado");

            }
        } catch (SQLException e) {
            System.out.println("deu ruim parceiro");
        }

    }

}
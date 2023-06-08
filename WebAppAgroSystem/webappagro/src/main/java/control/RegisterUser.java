package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.RegisterBean;
import model.UserDb;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterUser() {
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

        PrintWriter out = response.getWriter();

        String nome = request.getParameter("nome");
        String email = request.getParameter("e-mail");
        String password = request.getParameter("senha");

        RegisterBean user = new RegisterBean(nome, email, password);

        user.setNome(nome);
        user.setEmail(email);
        BigInteger cript;
        cript = RegisterBean.Criptografarsenha(password);
        user.setSenha(cript.toString());

        UserDb userDb = new UserDb();

        String s1 = userDb.insertUser(user);
        if (s1.equalsIgnoreCase("Insert concluded")) {

            response.sendRedirect("");
        } else {
            out.println("cadastro invalido");
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
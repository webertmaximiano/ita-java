/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author webert
 */
@WebServlet(urlPatterns = {"/oraculoController"})
public class OraculoController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //pegar o parametro
        String tipoProduto = request.getParameter("produto");
        //chamar a regra de negocio o Model
        Oraculo oraculo = new Oraculo();
        List<String> produtos = oraculo.melhoresProdutos(tipoProduto);
        //disponibilizar os dados para view
        request.setAttribute("produtos", produtos);
        // passar controle para um view
        request.getRequestDispatcher("resposta.jsp").forward(request, response);
    }

}

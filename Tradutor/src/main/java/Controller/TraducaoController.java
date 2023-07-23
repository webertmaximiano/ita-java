package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Model.TraducaoModel;

@WebServlet("/TraducaoServlet")
public class TraducaoController extends HttpServlet {
    private TraducaoModel tradutor;
  

    public TraducaoController() throws IOException {
        super();
        tradutor = new TraducaoModel();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String palavra = request.getParameter("palavra");

        TraducaoController traducaoController = new TraducaoController();
       
        
        request.setAttribute("palavra", palavra);
        request.setAttribute("traducao", traducaoController.tradutor.traduzir(palavra.toLowerCase()));
        request.getRequestDispatcher("/traducao.jsp").forward(request, response);
    }
}

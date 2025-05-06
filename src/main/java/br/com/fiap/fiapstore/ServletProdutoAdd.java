package br.com.fiap.fiapstore;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "produto", value = "/produto-servlet")
public class ServletProdutoAdd extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String nome = request.getParameter("nome");
        int qtd = Integer.parseInt(request.getParameter("quantidade"));
        double preco = Double.parseDouble(request.getParameter("preco"));

        System.out.println("Nome: " + nome +
                ", Quantidade: " + qtd +
                ", Preço: " + preco);

        HttpSession session = request.getSession();
        session.setAttribute("produto", nome+";"+preco);

        request.setAttribute("nome", nome);
        request.setAttribute("quantidade", qtd);
        request.setAttribute("preco", preco);

        request.getRequestDispatcher("sucesso.jsp").forward(request, response);
    }

    public void destroy() {
    }
}
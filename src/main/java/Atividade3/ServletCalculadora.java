package Atividade3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletCalculadora
 */
@WebServlet(name = "Atividade3", description = "ServletCalculadora", urlPatterns = { "/Atividade3" })
public class ServletCalculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCalculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
    	saida.write("<HTML><BODY>");
    	saida.write("Os parametros somados sao: <BR>");
    	
    	Enumeration<String> nomesParametros = request.getParameterNames();
    	int soma = 0;
    	while (nomesParametros.hasMoreElements()) {
    		String parametro = nomesParametros.nextElement().toString();
    		String valorParametro = request.getParameter(parametro);
    		int numeroConvertido = Integer.parseInt(valorParametro);
    		soma = soma + numeroConvertido;
		}
    	saida.write(Integer.toString(soma));
    	saida.write("</BODY></HTML>");
    	saida.close();	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

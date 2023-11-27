package es.studium.Practica3Modelo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PracticaT3Modelo
 */
@WebServlet("/PracticaT3Modelo")
public class PracticaT3Modelo extends HttpServlet {
	Modelo m = new Modelo();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PracticaT3Modelo() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String texto = request.getParameter("texto");
		String[] preFrases = texto.split(",");
		ArrayList<String> frases = new ArrayList<>(Arrays.asList(preFrases));
		ArrayList<String> resultado = m.quitarEspacios(frases);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"es\">");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\">");
		out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">");
		out.println("<link rel=\"stylesheet\" href=\"style.css\">");
		out.println("<title>Práctica Tema 3 DAW</title>");
		out.println("</head>");
		out.println("<body class=\"text-center\">");
		out.println("<h1 class=\"py-3\">¡Aquí tu resultado!</h1>");
		out.println("<h5 class=\"pb-3\">Resultado: " + resultado + "</h5>");
		out.println("<input type=\"submit\" value=\"Volver al inicio\" class=\"btn btn-success\"  />");
		out.println("</body>");
		out.println("</html>");
	}

}

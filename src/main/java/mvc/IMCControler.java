
mport java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/mvc/IMC")
public class IMCControler extends HttpServlet {
	
	@Override
	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		//Prepara para a execução.
		String alturaStr = request.getParameter("altura");
		alturaStr = alturaStr == null ? "0" : alturaStr;
		float altura = Integer.parseFloat(alturaStr);
		
        String PesoStr = request.getParameter("Peso");
		PesoStr = PesoStr == null ? "0" : PesoStr;
		float Peso = Integer.parseFloat(PesoStr);

		//Executa "regras de negócio".
		IMCModel imcModel = new IMCModel(altura, Peso);
		String condicao = IMCModel.condicao();
		
		//Passa a váriável para a página JSP.
		request.setAttribute("resultado", condicao);
		//Chama página JSP.
		request.getRequestDispatcher("IMC-view.jsp").
			forward(request, response);

	}
	
}

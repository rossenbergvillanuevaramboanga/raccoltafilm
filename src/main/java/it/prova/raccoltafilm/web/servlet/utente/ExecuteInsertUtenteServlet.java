package it.prova.raccoltafilm.web.servlet.utente;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.raccoltafilm.model.Utente;
import it.prova.raccoltafilm.service.MyServiceFactory;
import it.prova.raccoltafilm.service.RuoloService;
import it.prova.raccoltafilm.service.UtenteService;

@WebServlet("/admin/ExecuteInsertUtenteServlet")
public class ExecuteInsertUtenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UtenteService utenteService; 
	private RuoloService ruoloService; 

    public ExecuteInsertUtenteServlet() {
        super();
        this.utenteService = MyServiceFactory.getUtenteServiceInstance();
        this.ruoloService = MyServiceFactory.getRuoloServiceInstance();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Binding
		String usernameParam = request.getParameter("username");
		String nomeParam = request.getParameter("nome");
		String cognomeParam = request.getParameter("cognome");
		
		String passwordParam = request.getParameter("password");
		String passwordConfirmParam = request.getParameter("passwordConfirm");
		
		String[] ruoliParam = request.getParameterValues("ruoli");
		//${ruolo.id}
		
		//Validazione
		
		
	}

}

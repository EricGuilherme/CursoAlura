package br.com.caelum.struts.action;

import java.util.Locale;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class MudaIdiomaAction extends Action {

	public ActionForward execute(ActionMapping mapping, ServletRequest request, ServletResponse response) throws Exception {
		
		 String idioma = request.getParameter("idioma");
		    Locale locale = new Locale(idioma);

		    System.out.println("Mudando o locale para " + locale);
		    setLocale((HttpServletRequest) request, locale);

		    return mapping.findForward("ok");	
	}
}

package br.com.caelum.struts.action;


import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import br.com.caelum.struts.form.ContatoForm;

public class AdicionaContatoAction extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) throws Exception{	

		  System.out.println("Criando um novo contato...");

          ContatoForm formulario = (ContatoForm) form;

          Contato contato = formulario.getContato();
    
          ContatoDAO dao = new ContatoDAO();
          dao.adiciona(contato);
    
          return mapping.findForward("ok");
      }
	}
	

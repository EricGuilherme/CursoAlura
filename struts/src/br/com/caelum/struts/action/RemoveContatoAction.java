package br.com.caelum.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class RemoveContatoAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	
        System.out.println("Tentando remover um novo contato...");

        RemoveContatoForm formulario = ((RemoveContatoForm) form);
        Contato contato = formulario.getContato();
 
        ContatoDAO dao = new ContatoDAO();
        dao.remove(contato);

        return mapping.findForward("ok");
    }
}
package br.com.caelum.struts.action;
import org.apache.struts.action.ActionForm;

import br.com.caelum.struts.action.Contato;

public class RemoveContatoForm extends ActionForm {
    private Contato contato = new Contato();

    public Contato getContato() {
        return contato;
    }
}
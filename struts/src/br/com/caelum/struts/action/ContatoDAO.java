
package br.com.caelum.struts.action;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ContatoDAO {

    private static Long maiorAteAgora = 3l; // teremos 3 contatos em breve!
    private static final Map<Long, Contato> ALL = new HashMap<Long, Contato>();
   
    public Collection<Contato> getLista() {
        return ALL.values();
    }

    public void adiciona(Contato contato) {
        if(contato.getId()==null) {
            maiorAteAgora++;
            contato.setId(maiorAteAgora);
        }
        ALL.put(contato.getId(), contato);
    }

    public void remove(Contato contato) {
        ALL.remove(contato.getId());
    }

    public Contato procura(Long id) {
        return ALL.get(id);
    }
    
    static {
        ALL.put(1L, new Contato(1L, "Guilherme Silveira", "guilherme.silveira@caelum.com.br",
                                                                        "Rua Vergueiro 1"));
        ALL.put(2L, new Contato(2L, "Lais Granha", "lais.granha@caelum.com.br", 
                                                                        "Rua Vergueiro 2"));
        ALL.put(3L, new Contato(3L, "Cecilia Fernandes", "cecilia.fernandes@caelum.com.br", 
                                                                        "Rua Vergueiro 3"));
    }
    



}
package br.edu.infnet.infra.contatos;

import br.edu.infnet.domain.contatos.Contato;
import java.util.Collection;
import java.util.HashMap;
import org.springframework.stereotype.Repository;

@Repository
public class ContatoRepository {
    
    private HashMap<Integer, Contato> contatos;
    
    public ContatoRepository() {
        contatos = new HashMap<>();
        contatos.put(1, new Contato(1, "Ericka Oliveira", "ericka.oliveira@infnet.org", "996214578"));
        contatos.put(2, new Contato(2, "Aquiles Lins", "aquiles.lins@infnet.org", "988964578"));
        contatos.put(3, new Contato(3, "Maya Costa", "maya.costa@infnet.org", "999635520"));
 
    }
    
    public Collection<Contato> listar() {
        return this.contatos.values();
    }
    
    
    public Contato obter(int id) {
    return contatos.get(id);    
    }
    
}

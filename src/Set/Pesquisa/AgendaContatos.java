package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;
import java.util.zip.Adler32;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContatos(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }

        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;

    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContatos("Tiago", 12345);
        agendaContatos.adicionarContatos("Tiago", 0);
        agendaContatos.adicionarContatos("Tiago Henrique", 11234324);
        agendaContatos.adicionarContatos("Tiago 061", 1234545);
        agendaContatos.adicionarContatos("Joao Leite", 12345);
        agendaContatos.exibirContato();
        System.out.println(agendaContatos.pesquisarPorNome("Tiago"));
        System.out.println("Contato atualizado " + agendaContatos.atualizarNumeroContato("Joao Leite", 123456));
        agendaContatos.exibirContato();


    }
}

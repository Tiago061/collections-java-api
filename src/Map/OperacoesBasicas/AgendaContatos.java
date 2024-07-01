package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatosMap.isEmpty()){
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Tiago", 134325);
        agendaContatos.adicionarContato("Tiago", 134335);
        agendaContatos.adicionarContato("Tiago Henrique", 1347546);
        agendaContatos.adicionarContato("Pedro", 134095);
        agendaContatos.adicionarContato("Karol", 134305);
        agendaContatos.adicionarContato("Tiago", 1341245);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Pedro");
        agendaContatos.exibirContatos();
        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Tiago"));
    }

}

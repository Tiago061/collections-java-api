package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        this.tarefaSet.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                   tarefaParaRemover = t;
                   break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        }else {
            System.out.println("Conjunto está vazio!");
        }
        if(tarefaParaRemover == null){
            System.out.println("Tarefa não encontrada!");
        }

    }

    public void exibirTarefas(){
        if(!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);
        }else {
            System.out.println("Tarefa não encontrada!");
        }

    }
    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if(t.isconcluida()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;

    }
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasnaoConcluidas = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if (!t.isconcluida()){
                tarefasnaoConcluidas.add(t);
            }
        }
        return tarefasnaoConcluidas;
    }
    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }



    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaMarcarComoPendente = null;
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaMarcarComoPendente = t;
                break;
            }
        }
        if (tarefaMarcarComoPendente != null){
            if (tarefaMarcarComoPendente.isconcluida()){
                tarefaMarcarComoPendente.setConcluida(false);
            }
        }else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }
    public void limparListaTarefas() {
        if(tarefaSet.isEmpty()){
            System.out.println("A lista já está vazia!");
        }else {
            tarefaSet.clear();
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");
        listaTarefas.marcarTarefaConcluida("Preparar apresentação");
        listaTarefas.marcarTarefaConcluida("Organizar a mesa de trabalho");
        System.out.println(listaTarefas.obterTarefasConcluidas());

        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();



    }

}

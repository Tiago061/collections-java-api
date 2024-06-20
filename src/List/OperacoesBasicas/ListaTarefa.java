package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

//    public static void main(String[] args) {
//        ListaTarefa listaTarefa = new ListaTarefa();
//        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
//
//        listaTarefa.adicionarTarefa("tarefa 1");
//        listaTarefa.adicionarTarefa("tarefa 1");
//        listaTarefa.adicionarTarefa("tarefa 2");
//
//        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
//
//        listaTarefa.removerTarefa("Tarefa 1");
//        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
//
//        listaTarefa.obterDescricoesTarefas();
//
//
//
//
//
//
//    }

}

package Map.Ordenacao;

import Map.Pesquisa.Produto;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventoMap.put(data,new Evento(nome,atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }
    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate,Evento> entry : eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento " + entry.getValue() + " acontecerá na data " + entry.getKey());
                break;
            }
        }
    }
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 01), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 04), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JANUARY, 11), "Evento 3", "Atração 3");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();

    }
}

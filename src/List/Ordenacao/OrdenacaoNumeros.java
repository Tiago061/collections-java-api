package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numeroslist;

    public OrdenacaoNumeros() {
        this.numeroslist = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        this.numeroslist.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.numeroslist);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }
    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendente = new ArrayList<>(this.numeroslist);
        numerosDescendente.sort(Collections.reverseOrder());
        return numerosDescendente;
    }
    public void exibirNumero(){
        System.out.println(numeroslist);
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(7);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(8);

        ordenacaoNumeros.exibirNumero();
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println("###################");
        ordenacaoNumeros.exibirNumero();
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}

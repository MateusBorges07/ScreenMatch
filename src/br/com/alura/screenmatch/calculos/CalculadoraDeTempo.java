package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;


    }

    public void inclui(Titulo titulo){
        System.out.println("Adiciona a duração em minutos de "+ titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }


}

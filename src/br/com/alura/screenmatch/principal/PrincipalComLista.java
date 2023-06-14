package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Star wars",1992);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("STAR TRECK", 2034);
        outroFilme.avalia(5);
        var filmeDoMateus = new Filme("marvel", 2012);
        filmeDoMateus.avalia(7);
        Serie lost = new Serie("lost", 2000);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoMateus);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof  Filme filme && filme.getClassificacao() > 2){
                System.out.println("classificacao"+ filme.getClassificacao());
            }

        }


        ArrayList<String> BuscarPorArtista = new ArrayList<>();
        BuscarPorArtista.add("Mateus");
        BuscarPorArtista.add("Milena");
        BuscarPorArtista.add("Nuppy");
        BuscarPorArtista.add("Fred");
        System.out.println(BuscarPorArtista);

        Collections.sort(BuscarPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(BuscarPorArtista);

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}

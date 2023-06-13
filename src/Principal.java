import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Star wars");
        meuFilme.setAnoDeLancamento(1990);
        meuFilme.setDuracaoEmMinutos(190);
        System.out.println("duração do outroFilme: " + meuFilme.getDuracaoEmMinutos());


        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de Avaliaçoes: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes =10;
        //meuFilme.totalDeAvaliacoes = 1;


        Serie lost = new Serie();
        lost.setNome("lost");
        lost.setAnoDeLancamento(2000);
        lost.exibiFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporadas(9);
        lost.setMinutosPorEpisodio(50);
        System.out.println("duração para maratonar lost: " +  lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("STAR TRECK");
        outroFilme.setAnoDeLancamento(1950);
        outroFilme.setDuracaoEmMinutos(120);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);


        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(354);
        filtro.filtra(episodio);
    }
}
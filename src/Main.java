import com.laura.screenmatch.calculos.CalculadoraDeTiempo;
import com.laura.screenmatch.calculos.FiltroRecomendacion;
import com.laura.screenmatch.modelos.Episodio;
import com.laura.screenmatch.modelos.Pelicula;
import com.laura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula();
        pelicula1.setNombre("Bajo la misma estrella");
        pelicula1.setFechaDeLanzamiento(2010);
        pelicula1.setDuracionEnMinutos(130);
        pelicula1.setIncluidoEnElPlan(true);

        pelicula1.muestraFichaTecnica();
        pelicula1.evalua(9);
        pelicula1.evalua(7.5);

        System.out.println("\nMédia de evaluaciones de la película: " + pelicula1.calculaMedia());

        Serie chicaIndiscreta = new Serie();
        chicaIndiscreta.setNombre("Chica Indiscreta");
        chicaIndiscreta.setFechaDeLanzamiento(2001);
        chicaIndiscreta.setTemporadas(6);
        chicaIndiscreta.setMinutosPorEpisodio(70);
        chicaIndiscreta.setEpisodiosPorTemporadas(10);
        chicaIndiscreta.muestraFichaTecnica();
        System.out.println(chicaIndiscreta.getDuracionEnMinutos());

        Pelicula pelicula2 = new Pelicula();
        pelicula2.setNombre("Sirenita");
        pelicula2.setFechaDeLanzamiento(2000);
        pelicula2.setDuracionEnMinutos(120);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(pelicula1);
        calculadora.incluye(pelicula2);
        calculadora.incluye(chicaIndiscreta);
        System.out.println("Tiempo necesario para ver tus títulos favoritos estas vacaciones: " + calculadora.getTiempoTotal() + " minutos.");

        Episodio episodio1 = new Episodio();
        episodio1.setNombre("El descontrol de Serena");
        episodio1.setNumero(1);
        episodio1.setSerie(chicaIndiscreta);
        episodio1.setTotalDeVisualizaciones(50);

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(pelicula1);
        filtroRecomendacion.filtra(episodio1);
    }
}
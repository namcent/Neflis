import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main( String []Args) {
        Usuario roma = new Usuario();

        Pelicula rocky = new Pelicula(122, "Stalone", "Accion");
        Serie breakingBad = new Serie("Breaking Bad", (List<Temporada>)temporadas, "drama");

        Capitulo cap1A = new Capitulo("cap1A", "actor 1", 55);
        Capitulo cap1B = new Capitulo("Cap1B", "Actor 2", 50);
        Capitulo cap2B = new Capitulo("Cap2B", "Actor 3", 45);

        Temporada tempA = new Temporada(1, (List<Capitulo>) capitulosA);
        Temporada tempB = new Temporada(2, (List<Capitulo>) capitulosB);

        List<Capitulo> capitulosA = new ArrayList<>();
        capitulosA.add(cap1A);
        List<Capitulo> capitulosB = new ArrayList<>();
        capitulosB.add(cap1B);
        capitulosB.add(cap2B);


        List<Temporada> temporadas = new ArrayList<>();
        temporadas.add(tempA);
        temporadas.add(tempB);


        List<Contenido> contenidosVistos = new ArrayList<>();
        contenidosVistos.add(breakingBad);
        contenidosVistos.add(rocky);

        roma.setContenidosVistos(contenidosVistos);
        roma.getContenidosVistos();



        breakingBad.setGenero(("drama"));
        rocky.setGenero("romance");

        List<String>generosQueVio=new ArrayList<>();
        generosQueVio.add(breakingBad.genero());
        generosQueVio.add(rocky.genero());

        System.out.println(cap1A.fueVistoCompletoPor(roma)+ "vio el contenido completo del capitulo");
        System.out.println(roma.vioContenidoCompleto(rocky)+ "vio el contenido completo de rocky");
        System.out.println(roma.vioContenidoCompleto(breakingBad)+ "vio el contenido conmpleto de BB");

        breakingBad.duracion();
        rocky.duracion();

        System.out.println(tempA.duracion()+ "duracion de una temporada");
        System.out.println(breakingBad.duracion() + "duracion de capitulo Breaking Bad");
        System.out.println(rocky.duracion() + "duracion de Rocky");

        breakingBad.ultimoCapituloSerie();
        System.out.println(breakingBad.ultimoCapituloSerie().numeroCapitulo + " ultimo capitulo de la serie ");

        System.out.println(roma.generosQueVio()+ "generos que vio");
    }}
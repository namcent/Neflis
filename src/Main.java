import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main( String []Args){
        Usuario roma=new Usuario();
        Pelicula rocky = new Pelicula("rocky", 120);
        Serie breakingBad = new Serie("Breaking Bad", 5);

        Capitulo cap1A= new Capitulo(45);
        Capitulo cap1B=new Capitulo(45);
        Capitulo cap2B= new Capitulo(45);
        Temporada tempA=new Temporada(1, cap1A);
        Temporada tempB=new Temporada(2, cap1B);

        List<Contenido> contenidosVistos=new ArrayList<>();

        List<Temporada> temporadas=new ArrayList<>();
        temporadas.add(tempA);
        List<Temporada> temporadasB=new ArrayList<>();
        temporadasB.add(tempB);

        List<Capitulo> capitulosA= new ArrayList<>();
        capitulosA.add(cap1A);
        List<Capitulo> capitulosB= new ArrayList<>();
        capitulosB.add (cap1B);
        capitulosB.add (cap2B);

        roma.vioContenidoCompleto(rocky);
    roma.setContenidosVistos();
    }}
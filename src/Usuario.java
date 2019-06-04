public class Usuario {
    public Boolean vioContenidoCompleto(Contenido contenido) {
        return contenidoVisto.contains(contenido);
    }
    public Boolean contQueVio(Contenido contenido){
        return contQueVio.Stream().map(Contenido->contenido.getGenero()).
                distint().collect( Collectors.toSet());}
}
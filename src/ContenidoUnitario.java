public abstract class ContenidoUnitario implements Contenido{
    protected String actores;
    public Boolean fueVistoCompletoPor(Usuario usuario) {
        return true;
    }
    protected abstract Boolean generoMasVisto();

}

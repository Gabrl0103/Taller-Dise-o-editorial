public class Libro extends Publicacion {
    private int numeroPaginas;
    private int anioPublicacion;

    public Libro() {
        super();
        this.numeroPaginas = 0;
        this.anioPublicacion = 0;
    }

    public Libro(int numeroPaginas, int anioPublicacion) {
        super();
        this.numeroPaginas = numeroPaginas;
        this.anioPublicacion = anioPublicacion;
    }

    public Libro(int numeroPaginas, int anioPublicacion, String titulo, double precio) {
        super(titulo, precio);
        this.numeroPaginas = numeroPaginas;
        this.anioPublicacion = anioPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public void mostrar() {
        System.out.println("=== Libro ===");
        System.out.println("Título            : " + getTitulo());
        System.out.printf("Precio            : $ %,.0f%n", getPrecio());
        System.out.println("Número de páginas : " + numeroPaginas);
        System.out.println("Año de publicación: " + anioPublicacion);
    }

    @Override
    public String toString() {
        return "Libro{titulo='" + getTitulo() + "', precio=" + getPrecio()
                + ", numeroPaginas=" + numeroPaginas + ", anioPublicacion=" + anioPublicacion + "}";
    }
}

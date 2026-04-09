public class Publicacion {
    private String titulo;
    private double precio;

    public Publicacion() {
        this.titulo = "";
        this.precio = 0.0;
    }

    public Publicacion(String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrar() {
        System.out.println("=== Publicación ===");
        System.out.println("Título : " + titulo);
        System.out.printf("Precio : $ %,.0f%n", precio);
    }

    @Override
    public String toString() {
        return "Publicacion{titulo='" + titulo + "', precio=" + precio + "}";
    }
}

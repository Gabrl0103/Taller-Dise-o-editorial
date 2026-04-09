public enum Idioma {
    ESPANOL("Español"),
    INGLES("Inglés"),
    PORTUGUES("Portugués");

    private final String nombre;

    Idioma(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

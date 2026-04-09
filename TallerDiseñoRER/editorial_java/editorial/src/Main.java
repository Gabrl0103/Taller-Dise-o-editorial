import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static List<Publicacion> publicaciones = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerInt("Seleccione una opción: ");
            switch (opcion) {
                case 1 -> registrarLibro();
                case 2 -> registrarDisco();
                case 3 -> registrarVideo();
                case 4 -> mostrarTodas();
                case 0 -> System.out.println("\n¡Hasta luego!");
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
        sc.close();
    }

    static void mostrarMenu() {
        System.out.println("\n╔══════════════════════════════╗");
        System.out.println("║  EDITORIAL - GESTOR          ║");
        System.out.println("╠══════════════════════════════╣");
        System.out.println("║  1. Registrar Libro          ║");
        System.out.println("║  2. Registrar Disco          ║");
        System.out.println("║  3. Registrar Video          ║");
        System.out.println("║  4. Mostrar todas            ║");
        System.out.println("║  0. Salir                    ║");
        System.out.println("╚══════════════════════════════╝");
    }

    static void registrarLibro() {
        System.out.println("\n--- Nuevo Libro ---");
        String titulo = leerTexto("Título: ");
        double precio = leerDouble("Precio: ");
        int paginas = leerInt("Número de páginas: ");
        int anio = leerInt("Año de publicación: ");
        Libro libro = new Libro(paginas, anio, titulo, precio);
        publicaciones.add(libro);
        System.out.println("✔ Libro registrado correctamente.");
    }

    static void registrarDisco() {
        System.out.println("\n--- Nuevo Disco ---");
        String titulo = leerTexto("Título: ");
        double precio = leerDouble("Precio: ");
        float duracion = leerFloat("Duración en minutos: ");
        Disco disco = new Disco(duracion, titulo, precio);
        publicaciones.add(disco);
        System.out.println("✔ Disco registrado correctamente.");
    }

    static void registrarVideo() {
        System.out.println("\n--- Nuevo Video ---");
        String titulo = leerTexto("Título: ");
        double precio = leerDouble("Precio: ");
        float horas = leerFloat("Duración en horas: ");
        System.out.println("Idioma:");
        System.out.println("  1. Español");
        System.out.println("  2. Inglés");
        System.out.println("  3. Portugués");
        int opIdioma = leerInt("Seleccione idioma [1-3]: ");
        Idioma idioma = switch (opIdioma) {
            case 2 -> Idioma.INGLES;
            case 3 -> Idioma.PORTUGUES;
            default -> Idioma.ESPANOL;
        };
        Video video = new Video(idioma, horas, titulo, precio);
        publicaciones.add(video);
        System.out.println("✔ Video registrado correctamente.");
    }

    static void mostrarTodas() {
        if (publicaciones.isEmpty()) {
            System.out.println("\nNo hay publicaciones registradas aún.");
            return;
        }
        System.out.println("\n===== PUBLICACIONES REGISTRADAS =====");
        for (int i = 0; i < publicaciones.size(); i++) {
            System.out.println("\n[" + (i + 1) + "]");
            publicaciones.get(i).mostrar();
        }
        System.out.println("=====================================");
    }

    // --- Helpers de lectura segura ---

    static String leerTexto(String prompt) {
        System.out.print(prompt);
        return sc.nextLine().trim();
    }

    static int leerInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int valor = Integer.parseInt(sc.nextLine().trim());
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("  ⚠ Por favor ingrese un número entero válido.");
            }
        }
    }

    static double leerDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(sc.nextLine().trim().replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.println("  ⚠ Por favor ingrese un número válido (ej: 50000).");
            }
        }
    }

    static float leerFloat(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Float.parseFloat(sc.nextLine().trim().replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.println("  ⚠ Por favor ingrese un número válido (ej: 1.5).");
            }
        }
    }
}

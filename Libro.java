import java.util.Scanner;
public class Libro {
    String titulo, autor;
    int ejemplares, ejemplares_prestados;

    public Libro(String titulo, String autor, int ejemplares, int ejemplares_prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.ejemplares_prestados = ejemplares_prestados;
    }

    public Libro() {
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getEjemplares_prestados() {
        return ejemplares_prestados;
    }

    public void setEjemplares_prestados(int ejemplares_prestados) {
        this.ejemplares_prestados = ejemplares_prestados;
    }

    public boolean prestamo() {
        if (ejemplares_prestados < ejemplares) {
         ejemplares_prestados += ejemplares;
            return true;
        } 
                return false;
    }

    public boolean devolucion() {
        if (ejemplares_prestados > 0) {
            ejemplares -= ejemplares_prestados;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libro libro1 = new Libro("El señor de los anillos ", "J.R.R. Tolkien", 10, 0);

        Libro libro2 = new Libro();
        System.out.println("Ingrese el título del libro: ");
        libro2.setTitulo(sc.nextLine());

        System.out.println("Ingresar el nombre del autor: ");
        libro2.setAutor(sc.nextLine());

        System.out.println("Ingresar el numero de ejemplares: ");
        libro2.setEjemplares(sc.nextInt());
        System.out.println(" ");
        System.out.println("Prestamo del libro " + libro1.prestamo());   
        System.out.println("Devolucion del libro " + libro1.devolucion());
        System.out.println("");
        System.out.println("El segundo libro se llama: " + libro2.getTitulo());
        System.out.println("El autor se llama: " + libro2.getAutor());
        System.out.println("Tiene " + libro2.getEjemplares() + " ejemplares");
        
    }
}

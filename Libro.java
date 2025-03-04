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

    public boolean prestamo(int ejemplares, int ejemplares_prestados) {
        if (ejemplares_prestados > ejemplares) {
            System.out.println("No hay ejemplares disponibles!");
            
        } else if (ejemplares_prestados <= ejemplares) {
            ejemplares -= ejemplares_prestados;
            return true;
            
        }
                return false;
    }

    public boolean devolucion(int ejemplares_prestados) {
        if (ejemplares_prestados > 0) {
            ejemplares += ejemplares_prestados;
            ejemplares_prestados -= ejemplares_prestados;
            return true;
        } else {
            System.out.println("Número de ejemplares a devolver no válido!");
            return false;
        }
    }

    public static void main(String[] args) {

    }
}

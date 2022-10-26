package entities;

/**
 *
 * @author Xhemanuelv
 */
public class Peliculas {

    private String titulo;
    private String director;
    private Float duracion;

    public Peliculas() {
    }

    public Peliculas(String titulo, String director, float duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }

}

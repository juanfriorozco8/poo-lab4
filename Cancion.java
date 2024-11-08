public class Cancion {
    private String nombreCancion;
    private double duracion;
    private String autor;
    private String genero;
    
    public Cancion(String nombreCancion, double duracion, String autor, String genero) {
        this.nombreCancion = nombreCancion;
        this.duracion = duracion;
        this.autor = autor;
        this.genero = genero;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void escucharCancion(){
        String texto = " La canción se está reproduciendo"; 
        System.out.println(texto);
        return;
    }
    
}

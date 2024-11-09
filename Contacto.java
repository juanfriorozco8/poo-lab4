public class Contacto {
    private String nombre;
    private int telefono;
    private boolean estado;
    
    public Contacto(String nombre, int telefono, boolean estado) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String mostrarContacto(){
        String contact = String.format("El nombre es: %s \nsu número de telefono es: %2d", nombre, telefono);
        return contact;
    }
}

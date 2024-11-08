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

    public void mostrarContacto(){
        System.out.println("Nombre: "+ nombre +" Telefono: "+ telefono);
    }
}

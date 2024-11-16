public abstract class Car implements InterfaceCarC {
    private boolean estado;
    private int volumen;
    
    public Car(boolean estado, int volumen) {
        this.estado = estado;
        this.volumen = volumen;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    
}

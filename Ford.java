public class Ford extends Car {

    public Ford(boolean estado, int volumen){
        super(estado, volumen);
    }

    @Override
    public void ModoEspera(){

    }

    @Override
    public String VerPronostico(){
        String weather = "El día de hoy se ve bueno! estará soleado :)";
        return weather;
    }
}

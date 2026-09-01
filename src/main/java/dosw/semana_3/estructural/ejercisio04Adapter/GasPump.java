package dosw.semana_3.estructural.ejercisio04Adapter;

public class GasPump implements FuelService{

    @Override
    public void supply(int liters){
        System.out.println("Supliendo de gasolina " + liters + " litros");
    }
}

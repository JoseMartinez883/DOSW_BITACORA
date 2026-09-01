package dosw.semana_3.estructural.ejercisio04Adapter;

public class FastChargerAdapter implements FuelService{

    private final FastElectricCharger charger;

    public FastChargerAdapter(FastElectricCharger charger) {
        this.charger = charger;
    }


    @Override
    public void supply(int amount) {
        double KWH = convertLitersToKWH(amount);
        charger.fastCharge(KWH);
    }

    private double convertLitersToKWH(int liters){
        return liters * 8.0;
    }
}

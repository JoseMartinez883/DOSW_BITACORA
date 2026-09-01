package dosw.semana_3.estructural.ejercisio04Adapter;

public class SlowChargerAdapter implements FuelService{

    private final SlowElectricCharger charger;

    public SlowChargerAdapter(SlowElectricCharger charger) {
        this.charger = charger;
    }


    @Override
    public void supply(int amount) {
        double KWH = convertLitersToKWH(amount);
        charger.slowCharge(KWH);
    }

    private double convertLitersToKWH(int liters){
        return liters * 7.0;
    }
}

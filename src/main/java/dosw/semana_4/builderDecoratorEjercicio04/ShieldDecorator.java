package dosw.semana_4.builderDecoratorEjercicio04;


public class ShieldDecorator extends CharacterDecorator{

    public ShieldDecorator(Character character) {
        super(character);
    }

    @Override
    public String getArmor() {
        return super.getArmor() + " + escudo de hielo";
    }
}

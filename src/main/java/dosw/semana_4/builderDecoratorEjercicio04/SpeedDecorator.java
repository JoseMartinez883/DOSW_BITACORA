package dosw.semana_4.builderDecoratorEjercicio04;


public class SpeedDecorator extends CharacterDecorator{

    public SpeedDecorator(Character character) {
        super(character);
    }

    @Override
    public String getSkill() {
        return super.getSkill() + " + velocidad";
    }
}

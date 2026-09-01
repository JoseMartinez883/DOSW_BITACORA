package dosw.semana_4.builderDecoratorEjercicio04;

public class InvisibilityDecorator extends CharacterDecorator{

    public InvisibilityDecorator(Character character) {
        super(character);
    }

    @Override
    public String getSkill() {
        return super.getSkill() + " + Invisibilidad";
    }
}

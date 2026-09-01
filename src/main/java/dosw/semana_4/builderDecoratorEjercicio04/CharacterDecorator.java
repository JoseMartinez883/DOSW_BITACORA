package dosw.semana_4.builderDecoratorEjercicio04;


public class CharacterDecorator implements Character {
    private Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
    }


    @Override
    public String getArmor() {
        return character.getArmor();
    }

    @Override
    public String getWeapon() {
        return character.getWeapon();
    }

    @Override
    public String getSkill() {
        return character.getSkill();
    }
}

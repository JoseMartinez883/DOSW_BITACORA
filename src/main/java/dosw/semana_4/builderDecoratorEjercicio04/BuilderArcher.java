package dosw.semana_4.builderDecoratorEjercicio04;

public class BuilderArcher implements BuilderCharacter{
    private String armor;
    private String weapon;
    private String skill;

    @Override
    public BuilderCharacter setArmor(String armor) {
        this.armor = armor;
        return this;
    }

    @Override
    public BuilderCharacter setWeapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    @Override
    public BuilderCharacter setSkill(String skill) {
        this.skill = skill;
        return this;
    }

    public Warrior build(){
        return new Warrior(armor,weapon,skill);
    }
}

package dosw.semana_4.builderDecoratorEjercicio04;

public class BuilderWarrior implements BuilderCharacter {

    private String armor;
    private String weapon;
    private String skill;

    @Override
    public BuilderCharacter setArmor(String armor) {
        this.armor = armor;
        return this;
    }

    @Override
    public BuilderWarrior setWeapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    @Override
    public BuilderWarrior setSkill(String skill) {
        this.skill = skill;
        return this;
    }

    @Override
    public Character build(){
        return new Warrior(armor, weapon, skill);
    }
}

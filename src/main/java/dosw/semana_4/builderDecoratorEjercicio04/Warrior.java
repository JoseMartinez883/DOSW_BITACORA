package dosw.semana_4.builderDecoratorEjercicio04;



public class Warrior implements Character {

    private String armor;
    private String weapon;
    private String skill;

    public Warrior(String armor, String weapon, String skill) {
        this.armor = armor;
        this.weapon = weapon;
        this.skill = skill;
    }

    @Override
    public String getArmor() {
        return armor;
    }

    @Override
    public String getWeapon() {
        return weapon;
    }

    @Override
    public String getSkill() {
        return skill;
    }


}



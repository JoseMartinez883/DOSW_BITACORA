package dosw.semana_4.builderDecoratorEjercicio04;


public interface BuilderCharacter {

    BuilderCharacter setArmor(String armor);
    BuilderCharacter setWeapon(String weapon);
    BuilderCharacter setSkill(String skill);
    Character build();
}

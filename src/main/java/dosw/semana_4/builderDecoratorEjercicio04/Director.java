package dosw.semana_4.builderDecoratorEjercicio04;


public class Director {

    public Character constructEliteWarrior(BuilderCharacter builder) {
        return builder.setArmor("armadura de diamante")
                .setWeapon("espada legendaria")
                .setSkill("furia berserker")
                .build();
    }

    public Character constructFireMage(BuilderCharacter builder) {
        return builder.setArmor("tunica ignifuga")
                .setWeapon("baston de fuego")
                .setSkill("bola de fuego")
                .build();
    }

    public Character constructShadowArcher(BuilderCharacter builder) {
        return builder.setArmor("capa de sombras")
                .setWeapon("arco de obsidiana")
                .setSkill("flecha envenenada")
                .build();
    }
}

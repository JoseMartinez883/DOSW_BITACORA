package dosw.semana_4.builderDecoratorEjercicio04;


public class Main {

    public static void main(String[] args){

        BuilderWarrior builder = new BuilderWarrior();
        Character warrior = builder.setArmor("steel")
                .setWeapon("sword")
                .setSkill("rage").build();

        Character powered = new ShieldDecorator(
                new SpeedDecorator(warrior)
        );

        System.out.println(powered.getArmor());
        System.out.println(powered.getSkill());
    }
}

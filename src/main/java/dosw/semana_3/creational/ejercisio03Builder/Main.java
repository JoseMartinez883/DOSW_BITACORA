package dosw.semana_3.creational.ejercisio03Builder;

public class Main {

    public static void main(String[] args){

        ToyFactory factory = new ToyFactory();

        ActionDollBuilder actionDollBuilder = new ActionDollBuilder();
        factory.constructDoll(actionDollBuilder);
        ToyDoll actionDoll = actionDollBuilder.getResult();

        ClassDollBuilder classicDollBuilder = new ClassDollBuilder();
        factory.constructDoll(classicDollBuilder);
        ToyDoll classicDoll = classicDollBuilder.getResult();

        System.out.println(actionDoll.showInfo());
        System.out.println(classicDoll.showInfo());
    }
}

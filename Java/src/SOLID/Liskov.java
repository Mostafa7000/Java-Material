package SOLID;

//  This principle states that objects of a superclass should be replaceable with objects of a subclass without
//  affecting the correctness of the program.
//  (And all parent methods should make sense in the child class.)

interface FlyAbility{
    void fly();
}

class CanFly implements FlyAbility{
    @Override
    public void fly() {
        System.out.println("I'm Flying!!");
    }
}

class CantFly implements FlyAbility{
    @Override
    public void fly() {
        System.out.println("I'm not flying !!");
    }
}

abstract class Bird {
    FlyAbility flyAbility;

    public FlyAbility getFlyAbility() {
        return flyAbility;
    }

    public void setFlyAbility(FlyAbility flyAbility) {
        this.flyAbility = flyAbility;
    }

    abstract void fly();
}

class Sparrow extends Bird {
    public Sparrow(){
        flyAbility= new CanFly();
    }
    @Override
    void fly() {
        flyAbility.fly();
    }
}

class Ostrich extends Bird {
    public Ostrich(){
        flyAbility=new CantFly();
    }
    @Override
    void fly() {
        flyAbility.fly();
    }
}


public class Liskov {
    public static void main(String[] args) {
        Sparrow sparrow= new Sparrow();
        sparrow.fly();

        Ostrich ostrich= new Ostrich();
        ostrich.fly();
    }
}

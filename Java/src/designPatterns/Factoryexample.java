package designPatterns;

abstract class Sandwitch {
    private int price;
    private String description;

    public Sandwitch(int price, String description) {
        this.price = price;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

class Hotdog extends Sandwitch {
    public Hotdog(int price, String description) {
        super(price, description);
    }
}

class Burger extends Sandwitch {
    public Burger(int price, String description) {
        super(price, description);
    }

    @Override
    public String toString(){
        return getDescription()+'\n'+"Price= "+ getPrice();
    }
}

class Factory {
    public static final int BEEF = 1, HAM = 2, CHICKEN = 3;
    public Sandwitch getSandwitch(int type) {

        switch (type) {
            case BEEF:
                return new Burger(50, "BeefBurger");
            case HAM:
                return new Burger(60, "HamBurger");
            case CHICKEN:
                return new Burger(70, "ChickenBurger");
            default:
                return null;
        }
    }
}

public class Factoryexample {
    public static void main(String[] args) {
        var factory= new Factory();

        System.out.println(factory.getSandwitch(Factory.BEEF));
    }
}

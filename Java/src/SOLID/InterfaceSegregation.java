package SOLID;

// Interfaces shouldn't be fat

// Bad design
interface Worker {
    void work();
}

interface Eater{
    void eat();
}

class Engineer implements Worker, Eater {
    @Override
    public void work() {

    }

    @Override
    public void eat() {

    }
    // Implements both work() and eat()
}

class Chef implements Eater {
    @Override
    public void eat() {

    }
    // Implements both work() and eat()
}

class robot implements Worker{

    @Override
    public void work() {

    }

}

public class InterfaceSegregation {
}

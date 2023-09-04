package types;

public abstract class Student{

    private int age=50; // Initialization
    String name;
    public Student(){

    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void myMethod(){};
}


/**
 * Access modifiers
 * 1. public
 * 2. private
 * 3. protected --> visible to children and package public
 * 4. default --> package public
 */


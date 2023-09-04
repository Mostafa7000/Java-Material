package types;

public class NewStudent extends Student{
    public NewStudent(){
        super.name="Mostafa";
    }
    @Override
    public int getAge(){
        return 5000;
    }

    @Override
    public void myMethod(){
        System.out.println("Hello from my method!");
    }
}

package designPatterns;

// private constructor
// private instance of the object
// public function to return or instantiate the object

class Repository{
    private static Repository repository=null;

    private int port=8080;
    private String host= "localhost";
    private Repository(int port, String host){
        this.port=port;
        this.host=host;
    }

    public static Repository getInstance(int port, String host){
        if(Repository.repository == null)
            repository= new Repository(port,host);
        return Repository.repository;
    }

    public void connectToDataBase(){
        System.out.println("I'm connecting to database...");
    }
}
public class Singlton {
    public static void main(String[] args) {
        var instance1= Repository.getInstance(8080,"localhost");
        var instance2= Repository.getInstance(7080,"localhost");
        var instance3= Repository.getInstance(8080,"localhost");

        System.out.println(instance2.hashCode() == instance3.hashCode());
    }
}
